import java.util.ArrayList;
import java.util.Scanner;

public class Quizzes implements Exams {

    private int result;

    @Override
    public int getNumberOfQuestions() {
        return 10;
    }

    @Override
    public ArrayList<String> getQuestionlist() {
        for (int i=0; i<10; i++) {
            System.out.println(questionList.get(i));
        }
        return null;
    }

    @Override
    public void setQuestionlist(ArrayList<String> questionlist) {
        questionList.clear();
        for (int i=0; i<10; i++) {
            Scanner in = new Scanner(System.in);
            String question = in.nextLine();
            questionList.add(question);
        }

    }

    @Override
    public ArrayList<String> getModelAnswer() {
        for (int i=0; i<10; i++) {
            System.out.println(modelAnswer.get(i));
        }
        return null;
    }


    @Override
    public void setModelAnswer(ArrayList<String> modelAnswers) {
        modelAnswer.clear();
        for (int i=0; i<10; i++) {
            Scanner in = new Scanner(System.in);
            String question = in.nextLine();
            modelAnswer.add(question);
        }
    }

    public int getResult() {
        int res=0;
        for (int i=0; i<10; i++) {
            if (modelAnswer.get(i).equals(recievedanswer.get(i))) {
                res +=1;
            }
        }
        return res;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public int getSettedResult()
    {
        return result;
    }

    @Override
    public ArrayList<String> getRecievedAnswer() {
        for (int i=0; i<10; i++) {
            System.out.println(recievedanswer.get(i));
        }
        return null;
    }

    @Override
    public void setRecievedAnswer(ArrayList<String> recievedAnswer) {
        recievedanswer.clear();
        for (int i=0; i<10; i++) {
            Scanner in = new Scanner(System.in);
            String question = in.nextLine();
            recievedanswer.add(question);
        }
    }
}