import java.util.ArrayList ;
import java.util.Scanner;

public class Student extends User {

    private  int ID =1000 ;		// This function doesn't have a setter as you can't change your ID
    private  ArrayList <Courses> CoursesEnrolled ; //


    public Student() {
        this.ID += getCounter() ;
        incrementCounter ();
    }

    public Student (String name) { // constructor sare3
        super(name)  ;
        this.ID += getCounter() ;
        incrementCounter ();
    }

    public Student (String name, String Gender, String mail,int age) { // constructor main
        super(name,Gender,mail,age);
        this.ID += getCounter() ;
        incrementCounter ();
    }

    public int getID() {
        return ID;
    }
    public void giveRating(int X){
        System.out.println("choose rating for your instructor from 1 to 10");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        setRating(X);
    }
    public float showGrade() {
        float w =getGrade();
        return w;
    }

    public ArrayList<Courses> getCoursesEnrolled() {
        return CoursesEnrolled;
    }

    public void setCoursesEnrolled(ArrayList<Courses> coursesEnrolled) {
        CoursesEnrolled = coursesEnrolled;
    }


    @Override
    public void PrintInfo(){
        System.out.println("Student info : \n");
        System.out.println("\nname :"+super.getName() +
                "\nID : " + getID() +
                "\nGender" + super.getGender() +
                "\nmail" + super.getMail() +
                "\nAge" + super.getAge() +
                "\nGrade" + super.getGrade() +
                "\nTaken courses" + getCoursesEnrolled()
        );

    }
    //import some methods from quizzes
    Quizzes quizzes = new Quizzes();

    public int getQuizzResult(){
        return quizzes.getResult();
    }
    
    public ArrayList<String> getQuizzQuestionlist() {
        quizzes.getQuestionlist();
        return quizzes.getQuestionlist();
    }
    
    public void setQuizzRecievedAnswer(ArrayList<String> recievedAnswer) {
        quizzes.setRecievedAnswer(recievedAnswer);
    }

    //import some methods from practice
    Practice practice = new Practice();

    public int getPracticeResult(){
        return practice.getResult();
    }
    public ArrayList<String> getPracticeQuestionlist() {
        practice.getQuestionlist();
        return practice.getQuestionlist();
    }
    public void setPracticeRecievedAnswer(ArrayList<String> recievedAnswer) {
        practice.setRecievedAnswer(recievedAnswer);
    }
  
}