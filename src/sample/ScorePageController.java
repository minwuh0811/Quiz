package sample;

import database.DataBaseConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import object.Game;
import object.Player;

import java.sql.ResultSet;
import java.sql.Statement;


public class ScorePageController {
    private Game game ;

    public ScorePageController(Game game) {
        this.game = game;
    }

    @FXML
    private Label username;

    @FXML
    private TextField usernameField;

    @FXML
    private Label finalScore;

    @FXML
    private Text date;

    @FXML
    private Text enter;

    @FXML
    private Text welcome;
    @FXML
    private Button submit;

    @FXML
    private Text scoreField;



    @FXML
    public void initialize() {
        scoreField.setText(""+game.getFinalScore());
        date.setText(game.getFormatter().format(game.getDate()));
        welcome.setText("");
        handleButtonAction();
    }

    @FXML
    public void handleButtonAction(){
        submit.setOnAction(action -> {
            game.setPlayer(new Player(usernameField.getText()));
            welcome.setText("Welcome "+ usernameField.getText() + " !");
            enter.setText("");
            username.setText("");
            usernameField.setVisible(false);
            submit.setVisible(false);
            insertSQLGameScore(game);
        });

    }

    private void insertSQLGameScore(Game game) {
        DataBaseConnection dataBaseConnection=new DataBaseConnection();
        try(ResultSet resultSet=dataBaseConnection.getStatement().executeQuery("SELECT * FROM game");) {
            System.out.println("Connected.");
            resultSet.last();
            int n=resultSet.getRow()+1;
            String string = String.format("INSERT INTO `game` (`gameid`, `score`, `username`) VALUES(%d,%d,\'%s\');", n, game.getFinalScore(), game.getPlayer().getUsername());
            System.out.println(string);
            dataBaseConnection.getStatement().execute(string);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
