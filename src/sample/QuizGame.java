package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import object.*;
import database.DataBaseConnection;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;


public class QuizGame extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try (ResultSet resultSet = dataBaseConnection.getStatement().executeQuery("SELECT * FROM questions");
        ) {
            System.out.println("Connected.");
            resultSet.last();
            System.out.println("Number of lines:" + resultSet.getRow());
            resultSet.first();
            QuestionStorage questionStorage = LoadDataBase(resultSet);
            Game game = new Game(questionStorage);
            QuizPage(game);

        } catch (SQLException e) {
            System.err.println(e);
        }
    }


    public void QuizPage(Game game) throws Exception {
        QuizPageController quizTest = new QuizPageController(game);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuizPage.fxml"));
        loader.setController(quizTest);
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    public QuestionStorage LoadDataBase(ResultSet resultSet)throws Exception {
        QuestionStorage questions=new QuestionStorage();
        do {
            Choices choices=new Choices(resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
            choices.setRightChoice(resultSet.getString(7));
            Question question=new Question(resultSet.getString(2),choices);
            questions.addQuestion(question);

        } while(resultSet.next());

        return questions;
    }

}






