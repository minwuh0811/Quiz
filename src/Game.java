import java.util.ArrayList;
import java.util.Date;

public class Game {
    private Player player;
    private ArrayList<Question> questions=new ArrayList<>();
    private int finalScore;
    private String date;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Game(Player player, String date, ArrayList<Question> questions) {
        this.player = player;
        this.finalScore = 0;
        this.date = date;
        this.questions=questions;

    }

    public ArrayList<Question> Questions(Question question){
        questions.add(question);
        return questions;
    }

    public void addOneScore(){
        finalScore+=1;
    }



}
