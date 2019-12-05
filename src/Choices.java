import java.util.ArrayList;

public class Choices {
    private ArrayList<Choice> choices=new ArrayList<>();
    private Choice rightChoice;

    public Choices(Choice rightChoice, Choice choice2, Choice choice3, Choice choice4){
        choices.add(rightChoice);
        choices.add(choice2);
        choices.add(choice3);
        choices.add(choice4);
    }

    public Choices(Choice rightChoice){
        this.rightChoice=rightChoice;
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
}
