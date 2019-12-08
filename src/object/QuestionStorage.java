package object;

import java.util.ArrayList;

public class QuestionStorage {
    private ArrayList<Question> questions=new ArrayList<>();

    public QuestionStorage(){
    }

    public QuestionStorage(Question question){
        addQuestion(question);
    }



    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }


}
