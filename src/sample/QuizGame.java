package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import object.*;

import java.net.URL;


public class QuizGame extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
//       String javaVersion = System.getProperty("java.version");
//       String javafxVersion = System.getProperty("javafx.version");
//       Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
//       Scene scene = new Scene(new StackPane(l), 640, 480);
//       primaryStage.setScene(scene);
//       primaryStage.show();
         Choices choices=new Choices("Min","Anara","Karolin","Ann");
         choices.setRightChoice("Min");
         Question question=new Question("Who has the time today?", choices);
         QuestionStorage questions= new QuestionStorage(question);
         choices=new Choices("Stockholm","Malmo","Göteborg","Örebro");
         choices.setRightChoice("Stockholm");
         question=new Question("Which city is the capital of Sweden?", choices);
         questions.addQuestion(question);
         Game game=new Game(questions);
         QuizPage(game);

    }

    public void  QuizPage(Game game) throws Exception {
            QuizPageController quizTest = new QuizPageController(game);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("QuizPage.fxml"));
            loader.setController(quizTest);
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
    }





}
