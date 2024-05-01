import java.util.ArrayList;

public interface Exams {

    int numberOfQuestions=10;

    ArrayList<String> modelAnswer = new ArrayList<>();

    ArrayList<String> recievedanswer = new ArrayList<>();

    ArrayList<String> questionList = new ArrayList<>();



    public ArrayList<String> getQuestionlist();

    public ArrayList<String> getModelAnswer();

    public ArrayList<String> getRecievedAnswer();

    public int getNumberOfQuestions();

    //

    public void setRecievedAnswer(ArrayList<String> recievedAnswer);

    public void setQuestionlist(ArrayList<String> questionlist);

    public void setModelAnswer(ArrayList<String> modelAnswers);
}