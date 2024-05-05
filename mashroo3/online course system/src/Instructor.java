import java.util.ArrayList;
import java.util.Scanner;


public class Instructor extends User  {
    private String course ;
    Courses courses = new Courses();

    public Instructor() { //default const.
        incrementCounter();
        this.course=getCourse();
    }

    public Instructor (String name) { // constructor sare3
        super(name)  ;
        incrementCounter ();
    }

    public Instructor (String course,String name,String gender,String mail,int age) { // main constructor
        super(name,gender,mail,age);
        this.course=course;
        incrementCounter ();
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        System.out.println("enter your course info (name-hours-code) : ");
        Scanner in = new Scanner(System.in);
        course.setName(in.nextLine()) ;
        course.setCourseHours(in.nextInt());
        course.setCode(in.nextInt());
        course.setContent(in.nextLine());
    }

    @Override
    public void PrintInfo() {
        System.out.println("Instructor info : \n");
        System.out.println("\nname : " + super.getName() +
                "\nGender : " + super.getGender() +
                "\nmail : " + super.getMail() +
                "\nAge : " + super.getAge() +
                "\nRating : " + super.getRating() +"\n"
        );
    }

    public int showRating()
    {
        int rate = getRating();
        return rate;
    }
    //import some methods from quizzes class
    Quizzes quizzes = new Quizzes();

    public ArrayList<String> getQuizzQuestionlist() {
        quizzes.getQuestionlist();
        return quizzes.getQuestionlist();
    }
    public void setQuizzQuestionlist(ArrayList<String> questionlist){
        quizzes.setQuestionlist(questionlist);
    }
    public ArrayList<String> getQuizzModelAnswer() {
        quizzes.getModelAnswer();
        return null;
    }
    public void setQuizzModelAnswer(ArrayList<String> modelAnswer) {
        quizzes.setModelAnswer(modelAnswer);
    }


    //import methods from practice
    Practice practice = new Practice();

    public int getPracticeResult(){
        return practice.getResult();
    }
    public ArrayList<String> getPracticeQuestionlist() {
        practice.getQuestionlist();
        return practice.getQuestionlist();
    }
    public void setPracticeQuestionlist(ArrayList<String> questionlist){
        practice.setQuestionlist(questionlist);
    }
    public ArrayList<String> getPracticeModelAnswer() {
        practice.getModelAnswer();
        return null;
    }
    public void setPracticeModelAnswer(ArrayList<String> modelAnswer) {
        practice.setModelAnswer(modelAnswer);
    }
    public ArrayList<String> getPracticeRecievedAnswer() {
        practice.getRecievedAnswer();
        return null;
    }
    public void setPracticeResult(int result) {
        practice.setResult(result);
    }

}