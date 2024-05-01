import java.util.ArrayList;

public class Courses  {
    private String name;
    private int courseHours  ;
    private int code  ;
    private String content;
//    Instructor instructor = new Instructor();

    public Student [] EnrolledStudents ;

    public Courses(){}

    public Courses(String name,int courseHours,int code,String content){
        this.name=name;
        this.courseHours=courseHours;
        this.code=code;
        this.content=content;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    public Student[] getEnrolledStudents() {
        return EnrolledStudents;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setEnrolledStudents(Student[] enrolledStudents) {
        EnrolledStudents = enrolledStudents;
    }

    public void getCourseInfo()
    {
        System.out.println("cousrse name : "+ getName()+
                "\n course code: "+getCode() +
                "\ncourse hours : "+getCourseHours() +
                "\n content : "+getContent());

    }

    //import some methods from quizzes class
    Quizzes quizzes = new Quizzes();

    public int getQuizzResult(){
        return quizzes.getResult();
    }
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
    public ArrayList<String> getQuizzRecievedAnswer() {
        quizzes.getRecievedAnswer();
        return null;
    }
    public void setQuizzResult(int result) {
        quizzes.setResult(result);
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