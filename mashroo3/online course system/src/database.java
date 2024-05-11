import java.util.ArrayList;

public class database {


    public static ArrayList<Object> InstructorsArray = new ArrayList<>();
    public static ArrayList<Student> StudentsArray = new ArrayList<>();
    public static ArrayList<Courses> CoursesArray = new ArrayList<>();
    static ArrayList <String> t2 = new ArrayList <>() ;
    
    public database()
    {    // initialize array of object contains current instructors
    Instructor instructor1 = new Instructor("english", "ahmed", "male", "mail", 55) ;
    Instructor instructor8 = new Instructor("kemya", "ibrhim", "female", "mail", 30);
    
    Instructor instructor2 = new Instructor("arabic", "ibrahim", "male", "mail", 30);
    Instructor instructor3 = new Instructor("math", "ali", "male", "mail", 40) ; 
    
 // initialize array of object contains current Students
    Student s1 = new Student("ahmed", "male", "ahmed@gmail.com", 20);
    Student s2 = new Student("kareem", "male", "ahmed@gmail.com", 20);
    Student s3 = new Student("adham", "male", "ahmed@gmail.com", 20) ; 
    
   
    
    InstructorsArray.add(instructor1) ;
    InstructorsArray.add(instructor2);
    InstructorsArray.add(instructor3); 

    

    s1setRating(9) ;
    s2.setRating(8) ;
    s3.setRating(10);

    StudentsArray.add(s1)
    StudentsArray.add(s2);
    StudentsArray.add(s3);
    
    // initialize array of object contains current Courses
    Courses c1 = new Courses("english", 10, 100, "12 lectures");
    Courses c2 = new Courses("arabic", 12, 101, "10 lectures");
    Courses c3 = new Courses("math", 13, 102, "15 lectures");
    
   CoursesArray.add(c2);
   CoursesArray.add(c3);
   CoursesArray.add(c1);

    //Arraylists
    ArrayList<String> modelAnswer = new ArrayList<>();
    ArrayList<String> questionList = new ArrayList<>();

    }
}
