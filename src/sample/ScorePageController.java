package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import object.Game;
import object.Player;

import java.io.BufferedReader;
import java.util.Scanner;

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
            System.out.println(usernameField.getText());
            game.setPlayer(new Player(usernameField.getText()));
            welcome.setText("Welcome "+ usernameField.getText() + " !");
            enter.setText("");
            username.setText("");
            usernameField.setVisible(false);
            submit.setVisible(false);
        });

    }



}
