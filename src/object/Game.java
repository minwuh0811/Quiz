package object;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Game {
    private Player player;
    private QuestionStorage questionsStorage;
    private int finalScore;
    private Date initialDate;
    private Date finalDate;
    private SimpleDateFormat formatter;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public QuestionStorage getQuestionStorage() {
        return questionsStorage;
    }

    public void setQuestionStorage(QuestionStorage questionsStorage) {
        this.questionsStorage =questionsStorage;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public Date getDate() {
        return initialDate;
    }

    public Game(Player player, QuestionStorage questionsStorage) {
        this.player = player;
        this.finalScore = 0;
        this.initialDate=new Date();
        this.formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        printDate(this.initialDate);
        this.questionsStorage=questionsStorage;

    }

    public Game(QuestionStorage questionsStorage) {
        this.player= new Player("Guess");
        this.finalScore = 0;
        this.initialDate=new Date();
        this.formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        printDate(this.initialDate);
        this.questionsStorage=questionsStorage;

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

    public SimpleDateFormat getFormatter() {
        return formatter;
    }
}
