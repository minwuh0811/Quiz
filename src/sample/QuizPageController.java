package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import object.Game;
import object.Question;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class QuizPageController {
    private Game game;
    private int n;

    public QuizPageController(Game game) {
        this.game = game;
        this.n = 0;

    }

    @FXML
    private Button submit;
    @FXML
    private Label score;
    @FXML
    private Text textScore;
    @FXML
    private CheckBox checkbox1;
    @FXML
    private CheckBox checkbox2;
    @FXML
    private CheckBox checkbox3;
    @FXML
    private CheckBox checkbox4;

    ArrayList<CheckBox> checkBoxes = new ArrayList<>();

    @FXML
    private Text textQuestion;

    @FXML
    public void initialize() {
        ArrayList<String> choices = game.getQuestionStorage().getQuestions().get(n).getChoices().getChoices();
        checkBoxes.add(checkbox1);
        checkBoxes.add(checkbox2);
        checkBoxes.add(checkbox3);
        checkBoxes.add(checkbox4);
        for (int n = 0; n < choices.size(); n++) {
            checkBoxes.get(n).setText(choices.get(n));
            checkBoxes.get(n).setSelected(false);
        }
        textScore.setText("" + game.getFinalScore());
        textQuestion.setText(game.getQuestionStorage().getQuestions().get(n).getQuestion());
        handleButtonAction();

    }

    @FXML
    public String SelectCheckbox() {
        String text = "null";
        if (checkbox1.isSelected()) {
            text = checkbox1.getText();
        } else if (checkbox2.isSelected()) {
            text = checkbox2.getText();
        } else if (checkbox3.isSelected()) {
            text = checkbox3.getText();
        } else if (checkbox4.isSelected()) {
            text = checkbox4.getText();
        }
        return text;
    }

    @FXML
    public void handleButtonAction()  {
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String result = SelectCheckbox();
                if (!result.equals("null")) {
                    System.out.println(game.getQuestionStorage().getQuestions().get(n).getChoices().getRightChoice());
                    if (result.equals(game.getQuestionStorage().getQuestions().get(n).getChoices().getRightChoice())) {
                        game.setFinalScore(game.getFinalScore() + 1);
                    }
                    n += 1;
                    if (n < game.getQuestionStorage().getQuestions().size()) {
                        initialize();
                    } else {
                        System.out.println("final score is " + game.getFinalScore());
                        try {
                            ScorePage(game);
                        } catch (Exception e){
                            System.out.println(e);
                        }
                    }
                }
            }
        });
    }


    public void ScorePage(Game game) throws Exception {
        ScorePageController scorePageController = new ScorePageController(game);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScorePage.fxml"));
        loader.setController(scorePageController);
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

}


//            if (event.getSource()==submit) {
//
//
//            }
//        }

//if (!result.equals("null")) {
//        n += 1;
//        if (result.equals(game.getQuestionStorage().getQuestions().get(n).getChoices().getRightChoice())) {
//            game.setFinalScore(game.getFinalScore() + 1);
//        }
//        initialize();
//    }












