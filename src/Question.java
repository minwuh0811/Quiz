import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<Choice> choices= new ArrayList<>();
    private Choice rightChoice;

    public Question(String question, ArrayList<Choice> choices, Choice rightChoice) {
        this.question = question;
        this.choices = choices;
        this.rightChoice = rightChoice;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<Choice> choices) {
        this.choices = choices;
    }

    public Choice getRightChoice() {
        return rightChoice;
    }

    public void setRightChoice(Choice rightChoice) {
        this.rightChoice = rightChoice;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", choices=" + choices +
                ", rightChoice=" + rightChoice +
                '}';
    }
}
