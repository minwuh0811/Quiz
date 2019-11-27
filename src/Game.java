import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Game {
    private Player player;
    private ArrayList<Question> questions=new ArrayList<>();
    private int finalScore;
    private Date initalDate;
    private Date finalDate;
    private SimpleDateFormat formatter;

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

    public Date getDate() {
        return initalDate;
    }

    public Game(Player player, ArrayList<Question> questions) {
        this.player = player;
        this.finalScore = 0;
        this.initalDate=new Date();
        this.formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        printDate(this.initalDate);
        this.questions=questions;

    }

    public ArrayList<Question> Questions(Question question){
        questions.add(question);
        return questions;
    }

    public void addOneScore(){
        finalScore+=1;
    }


    public void printDate(Date date){
        System.out.println(formatter.format(date));

    }

    public void printFinalDate(){
        this.finalDate=new Date();
        System.out.println(formatter.format(finalDate));
    }

}
