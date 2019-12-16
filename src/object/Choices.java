package object;

import java.util.ArrayList;
import java.util.Random;

public class Choices {
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private ArrayList<String> shuffleChoices=new ArrayList<>();
    private String rightChoice;



    public Choices(String choice1, String choice2, String choice3, String choice4){
        ArrayList<String> choices=new ArrayList<>();
        this.choice1=choice1;
        this.choice2=choice2;
        this.choice3=choice3;
        this.choice4=choice4;
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);
        choices.add(choice4);
        this.shuffleChoices=ShuffleChoices(choices);
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }


    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public Choices(String rightChoice){
        this.rightChoice=rightChoice;
    }

    public ArrayList<String> getShuffleChoices() {
        return shuffleChoices;
    }

    public void setShuffleChoices(ArrayList<String> shuffleChoices) {
        this.shuffleChoices = shuffleChoices;
    }

    public String getRightChoice() {
        return rightChoice;
    }



    public void setRightChoice(String rightChoice) {
        for (String choice: shuffleChoices){
            if (choice.equals(rightChoice)){
                this.rightChoice=rightChoice;
                return;
            }
        }
        System.out.println("Not Valid Input!!");
    }

    public ArrayList<String> ShuffleChoices(ArrayList<String> choices){
        Random random=new Random();
        ArrayList<String> shuffleChoices=new ArrayList<>();
        while (choices.size()>0) {
            int randomNumber=random.nextInt(choices.size());
            shuffleChoices.add(choices.get(randomNumber));
            choices.remove(randomNumber);
        }
        return shuffleChoices;






    }

}
