////////////////////////////////////////////////////////////////////////////////
//Authors Kareem,Ahmed and Adham
/////////////////////////////////////////////////////////////////////
// main without gui
// main with gui at the end of the file

// please uncomment the block that you want to run

/*
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Toolkit;
import java.util.InputMismatchException;

public class Main {

    //ArrayLists
    static ArrayList<Object> InstructorsArray = new ArrayList<>();
    static ArrayList<Object> StudentsArray = new ArrayList<>();
    static ArrayList<Object> CoursesArray = new ArrayList<>();

   //exception handling
    public static int getRangeInt() {
        int x=0 ;
        boolean flag = true ;
        do {
            try {
                Scanner scan = new Scanner(System.in) ;
                x=scan.nextInt();
                if (x < 0 || x > 3) {
                    throw new IntMissMatch("Number must be between 0 and 3");
                }
                flag = false ;

            }
            catch (InputMismatchException e)
            {
                System.out.println("Please re-enter positive integer number") ;
            }
            catch (IntMissMatch e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        while (flag) ;
        return x ;

    }

    public static int getInt() {
        int x=0 ;
        boolean flag = true ;
        do {
            try {
                Scanner scan = new Scanner(System.in) ;
                x=scan.nextInt();
                if (x <= 0 ) {
                    throw new IntMissMatch("Number must be greater than 0");
                }
                flag = false ;

            }
            catch (InputMismatchException e)
            {
                System.out.println("Please re-enter positive integer number") ;
            }
            catch (IntMissMatch e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        while (flag) ;
        return x ;

    }

    public static boolean getBool() {
        boolean x= false ;
        boolean flag = true ;
        do {
            try {

                Scanner scan = new Scanner(System.in) ;
                x=scan.nextBoolean() ;
                flag = false ;

            }
            catch (InputMismatchException e)
            {
                System.out.println("Please re-enter true or false") ;
            }
        }
        while (flag) ;
        return x ;

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        // initialize array of object contains current instructors
        Instructor instructor1 = new Instructor("programming", "heba", "female", "nesma@gmail.com", 30);
        Instructor instructor2 = new Instructor("arabic", "ibrahim", "male", "ahmed@gmail.com", 30);
        Instructor instructor3 = new Instructor("math", "ali", "male", "ali@gmail.com", 40);
        InstructorsArray.add(instructor1);
        InstructorsArray.add(instructor2);
        InstructorsArray.add(instructor3);

        // initialize array of object contains current Students
        Student s1 = new Student("ahmed", "male", "ahmed@gmail.com", 20);
        Student s2 = new Student("kareem", "male", "kareem@gmail.com", 20);
        Student s3 = new Student("sallam", "male", "sallam@gmail.com", 20);
        Student s4 = new Student("adham", "male", "adham@gmail.com", 20);
        Student s5 = new Student("abdo", "male", "abdo@gmail.com", 20);
        Student s6 = new Student("ziad", "male", "ziad@gmail.com", 20);
        StudentsArray.add(s1);
        StudentsArray.add(s2);
        StudentsArray.add(s3);
        StudentsArray.add(s4);
        StudentsArray.add(s5);
        StudentsArray.add(s6);
        s1.setRating(9);
        s2.setRating(8);
        s3.setRating(10);
        s4.setRating(9);
        s5.setRating(8);
        s6.setRating(10);

        // initialize array of object contains current Courses
        Courses c1 = new Courses("programming", 10, 100, "12 lectures");
        Courses c2 = new Courses("arabic", 12, 101, "10 lectures");
        Courses c3 = new Courses("math", 13, 102, "15 lectures");
        Courses c4 = new Courses("english", 11, 103, "12 lectures");
        Courses c5 = new Courses("physics", 15, 104, "10 lectures");
        Courses c6 = new Courses("drawing", 9, 105, "15 lectures");
        CoursesArray.add(c1);
        CoursesArray.add(c2);
        CoursesArray.add(c3);
        CoursesArray.add(c4);
        CoursesArray.add(c5);
        CoursesArray.add(c6);

        //courses for enrolled students
        s1.setCoursesEnroll(c1);s1.setCoursesEnroll(c2);
        s2.setCoursesEnroll(c3);s2.setCoursesEnroll(c4);
        s3.setCoursesEnroll(c5);s3.setCoursesEnroll(c6);
        s4.setCoursesEnroll(c1);s4.setCoursesEnroll(c2);
        s5.setCoursesEnroll(c3);s5.setCoursesEnroll(c4);
        s6.setCoursesEnroll(c5);s6.setCoursesEnroll(c6);


        //Arraylists
        ArrayList<String> modelAnswer = new ArrayList<>();
        ArrayList<String> questionList = new ArrayList<>();
        ArrayList<String> recievedAns = new ArrayList<>();

        //main function
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Hello to NINJA online courses application");
        System.out.println("-------------------------------------------");
        System.out.println("""
                Are you STUDENT / INSTRUCTOR ?
                ---------------------------------
                for INSTRUCTOR enter false
                for STUDENT enter true
                """);
        Toolkit.getDefaultToolkit().beep();
        boolean x = getBool();

        //check if Student\Instructor
        if (x == true) {

            System.out.println("hello student");
            System.out.println("-----------------------------");
            System.out.println("""
                    Are you new student or current student
                    ---------------------------------
                    for CURRENT student enter false
                    for NEW student enter true
                    """);
            System.out.println("-----------------------------");
            Toolkit.getDefaultToolkit().beep();
            boolean xx = getBool();

            if (xx == false) {

                //get info about student / do some operations
                System.out.println("Enter your name");
                System.out.println("-----------------------------");
                Toolkit.getDefaultToolkit().beep();
                Scanner in = new Scanner(System.in);
                String instName = in.nextLine();
                boolean chck = false;
                for (Object o : StudentsArray) {
                    Student std = (Student) o;
                    if (std.getName().equals(instName)) {
                        std.PrintInfo();
                        Student currentStudent = (Student) o;
                        System.out.println("----------------------------");
                        System.out.println("what operation do you prefer to do :");
                        System.out.println("----------------------------");
                        System.out.println("""
                                0 For choose new courses
                                1 For Quiz
                                2 For Practice
                                3 For give rating to instructors
                                """);
                        System.out.println("----------------------------");
                        Toolkit.getDefaultToolkit().beep();
                        int x5 = getRangeInt();
                        if (x5 == 0) {
                            ArrayList<Courses> cc = new ArrayList<>();
                            for (Object object : CoursesArray) {
                                cc.add((Courses) object);
                            }
                            currentStudent.setCoursesEnrolled(cc);
                        }
                        else if (x5 == 1) {
                            System.out.println("Questions of the quiz: \n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            currentStudent.getQuizzQuestionlist();
                            System.out.println("answres: \n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            currentStudent.setQuizzRecievedAnswer(recievedAns);
                            System.out.println("----------------------------");
                            System.out.println("----------------------------");
                            System.out.println("your result is :\n"+currentStudent.getQuizzResult()+"/10");
                            System.out.println("----------------------------");
                            System.out.println("----------------------------");
                            System.out.println("the model answer is :\n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            currentStudent.getQuizzModelAnswer();
                        }
                        else if (x5 == 2) {
                            System.out.println("Questions of the practice: \n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            currentStudent.getPracticeQuestionlist();
                            System.out.println("answres: \n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            currentStudent.setPracticeRecievedAnswer(recievedAns);
                            System.out.println("your result is :\n"+currentStudent.getPracticeResult()+"/10");
                            System.out.println("----------------------------");
                            System.out.println("----------------------------");
                            System.out.println("the model answer is :\n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            currentStudent.getPracticeModelAnswer();
                        }
                        else if (x5 == 3) {
                            for (int v=0; v<InstructorsArray.size(); v++) {
                                Instructor instructor = (Instructor) InstructorsArray.get(v);
                                System.out.println((v+1)+"- "+instructor.getName());
                            }
                            System.out.println("please choose an instructor \n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            int u =in.nextInt();
                            Instructor instructor = (Instructor) InstructorsArray.get((u-1));
                            System.out.println("please give your instructor a rate from 1 to 10 \n");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            int u1 =in.nextInt();
                            currentStudent.giveRating(u1,instructor);
                            System.out.println("thank you\n");
                            Toolkit.getDefaultToolkit().beep();
                        }
                        chck = true;
                        break;
                    }
                }
                if (chck == false) {
                    System.out.println("you are not a current student please login as new student\n");
                }
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (xx == true) {

                //set info about student
                Scanner in4 = new Scanner(System.in);
                System.out.println("\n hi student \n");
                System.out.println("enter your name \n");
                Toolkit.getDefaultToolkit().beep();
                String std_name = in4.nextLine();
                System.out.println("enter your age \n");
                int std_age = getInt();
                System.out.println("enter your mail \n");
                Toolkit.getDefaultToolkit().beep();
                String std_mail = in4.nextLine();
                System.out.println("enter your gender \n");
                Toolkit.getDefaultToolkit().beep();
                String std_gender = in4.nextLine();

                Student newstudent = new Student(std_name, std_gender, std_mail, std_age);
                StudentsArray.add(newstudent);
                newstudent.PrintInfo();

                //operation for new student
                System.out.println("----------------------------");
                System.out.println("what operation do you prefer to do :");
                System.out.println("----------------------------");
                System.out.println("""
                                0 For choose new courses
                                1 For Quiz
                                2 For Practice
                                3 For NO Operations
                                """);
                System.out.println("----------------------------");
                Toolkit.getDefaultToolkit().beep();
                int x5 = getRangeInt();
                if (x5 == 0) {
                    ArrayList<Courses> cc = new ArrayList<>();
                    for (Object object : CoursesArray) {
                        cc.add((Courses) object);
                    }
                    newstudent.setCoursesEnrolled(cc);
                }
                else if (x5 == 1) {
                    System.out.println("there is no quizzes for you yet! \n");
                    System.out.println("----------------------------");

                }
                else if (x5 == 2) {
                    System.out.println("there is no practice for you yet! \n");
                    System.out.println("----------------------------");

                }
                else if (x5 == 3) {
                    System.out.println("thank you : " + newstudent.getName());
                    System.out.println("----------------------------");

                }
            }

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////

            //check if current\new instructor
        }
        /////////////////////////////////////////////////////////
        else if (x == false) {
            System.out.println("Hello instructor");
            System.out.println("-----------------------------");
            System.out.println("""
                    Are you new instructor or current instructor
                    ---------------------------------
                    for CURRENT INSTRUCTOR enter false
                    for NEW INSTRUCTOR enter true
                    """);
            System.out.println("-----------------------------");
            Toolkit.getDefaultToolkit().beep();
            boolean x1 = getBool();

            if (x1 == false) {

                //get info about instructor / do some operations
                System.out.println("Enter your name");
                System.out.println("-----------------------------");
                Toolkit.getDefaultToolkit().beep();
                Scanner in1 = new Scanner(System.in);
                String instName = in1.nextLine();
                boolean chck2=false;
                for (Object o : InstructorsArray) {
                    Instructor ins = (Instructor) o;
                    if (ins.getName().equals(instName)) {
                        ins.PrintInfo();
                        Instructor currentInstructor = (Instructor) o;
                        System.out.println("----------------------------");
                        System.out.println("what operation do you prefer to do :");
                        System.out.println("----------------------------");
                        System.out.println("""
                                0 For Quiz
                                1 For Practice
                                2 For show rating
                                3 For get your enrolled students
                                """);
                        System.out.println("----------------------------");
                        Toolkit.getDefaultToolkit().beep();
                        int x2 = getRangeInt();
                        //////////////////////////////////////////////////////////////////////////
                        if (x2 == 0) {
                            //quizzes operations
                            System.out.println("what operation do you prefer to do :");
                            System.out.println("----------------------------");
                            System.out.println("""
                                    0 For get quiz questions
                                    1 For set quiz questions
                                    2 For get quiz model answer
                                    3 For set quiz model answer
                                    """);
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            int x3 = getRangeInt();
                            if (x3 == 0) {
                                System.out.println("there is the quiz questions");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.getQuizzQuestionlist();
                            }
                            if (x3 == 1) {
                                System.out.println("please enter the quiz questions");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.setQuizzQuestionlist(questionList);
                            }
                            if (x3 == 2) {
                                System.out.println("there is the quiz model answer");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.getQuizzModelAnswer();
                            }
                            if (x3 == 3) {
                                System.out.println("please enter the quiz model answer");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.setQuizzModelAnswer(modelAnswer);
                            }
                        }
                        //////////////////////////////////////////////////////////////////////////
                        if (x2 == 1) {
                            //practice operations
                            System.out.println("what operation do you prefer to do :");
                            System.out.println("----------------------------");
                            System.out.println("""
                                    0 For get practice questions
                                    1 For set practice questions
                                    2 For get practice model answer
                                    3 For set practice model answer
                                    """);
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            int x3 = getRangeInt();
                            if (x3 == 0) {
                                System.out.println("there is the practice questions");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.getPracticeQuestionlist();
                            }
                            if (x3 == 1) {
                                System.out.println("please enter the practice questions");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.setPracticeQuestionlist(questionList);
                            }
                            if (x3 == 2) {
                                System.out.println("there is the practice model answer");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.getPracticeModelAnswer();
                            }
                            if (x3 == 3) {
                                System.out.println("please enter the practice model answer");
                                System.out.println("----------------------------");
                                Toolkit.getDefaultToolkit().beep();
                                currentInstructor.setPracticeModelAnswer(modelAnswer);
                            }
                        }
                        //////////////////////////////////////////////////////////////////////////
                        if (x2 == 2) {
                            int rate = 0;
                            for (Object object : StudentsArray) {
                                Student s = (Student) object;
                                rate += s.getRating();
                            }
                            System.out.println("your rating is :" + (rate / StudentsArray.size()));
                            Toolkit.getDefaultToolkit().beep();
                        }
                        if (x2 == 3) {
                            currentInstructor.getEnrolledSt(StudentsArray,currentInstructor);
                        }
                        chck2=true;
                        break;
                    }
                }
                if(chck2==false){
                    System.out.println("you are not a current instructor please login as a new instructor\n");
                    Toolkit.getDefaultToolkit().beep();
                }
            }
            ///////////////////////////////////////////////////////////
            else if (x1 == true) {
                Scanner in4 = new Scanner(System.in);

                System.out.println("\n hi instructor \n");
                System.out.println("enter your name \n");
                Toolkit.getDefaultToolkit().beep();
                String ins_name = in4.nextLine();
                System.out.println("enter your age \n");
                int ins_age = getInt();
                System.out.println("enter your mail \n");
                Toolkit.getDefaultToolkit().beep();
                String ins_mail = in4.nextLine();
                System.out.println("enter your gender \n");
                Toolkit.getDefaultToolkit().beep();
                String ins_gender = in4.nextLine();
                System.out.println("enter your course name \n");
                Toolkit.getDefaultToolkit().beep();
                String course_name = in4.nextLine();
                //
                Instructor newInstructor = new Instructor(course_name, ins_name, ins_gender, ins_mail, ins_age);
                //
                System.out.println("enter your course hours \n");
                Toolkit.getDefaultToolkit().beep();
                int course_hours = getInt();
                System.out.println("enter your course code \n");
                Toolkit.getDefaultToolkit().beep();
                int course_code = getInt();
                System.out.println("enter your course content \n");
                Toolkit.getDefaultToolkit().beep();
                String course_content = in4.nextLine();
                //
                Courses newCourse = new Courses(course_name, course_hours, course_code, course_content);
                //
                newInstructor.PrintInfo();
                newCourse.getCourseInfo();
                System.out.println("----------------------------");

                //add new objects
                CoursesArray.add(newCourse);
                InstructorsArray.add(newInstructor);

                //operations for new Instructor
                System.out.println("""
                        what operation do you prefer to do :");"
                        false For No Operations
                        true For Operations
                        """);
                boolean bo = getBool();
                if(bo==false){
                    System.out.println("thank you INS :" + newInstructor.getName());
                }
                if(bo==true){
                    System.out.println("----------------------------");
                    System.out.println("what operation do you prefer to do :");
                    System.out.println("----------------------------");
                    System.out.println("""
                                0 For Quiz
                                1 For Practice
                                2 For show rating
                                3 For get your enrolled students
                                """);
                    System.out.println("----------------------------");
                    Toolkit.getDefaultToolkit().beep();
                    int x2 = getRangeInt();
                    //////////////////////////////////////////////////////////////////////////
                    if (x2 == 0) {
                        //quizzes operations
                        System.out.println("what operation do you prefer to do :");
                        System.out.println("----------------------------");
                        System.out.println("""
                                    0 For get quiz questions
                                    1 For set quiz questions
                                    2 For get quiz model answer
                                    3 For set quiz model answer
                                    """);
                        System.out.println("----------------------------");
                        Toolkit.getDefaultToolkit().beep();
                        int x3 = getRangeInt();
                        if (x3 == 0) {
                            System.out.println("there is the quiz questions");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.getQuizzQuestionlist();
                        }
                        if (x3 == 1) {
                            System.out.println("please enter the quiz questions");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.setQuizzQuestionlist(questionList);
                        }
                        if (x3 == 2) {
                            System.out.println("there is the quiz model answer");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.getQuizzModelAnswer();
                        }
                        if (x3 == 3) {
                            System.out.println("please enter the quiz model answer");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.setQuizzModelAnswer(modelAnswer);
                        }
                    }
                    //////////////////////////////////////////////////////////////////////////
                    if (x2 == 1) {
                        //practice operations
                        System.out.println("what operation do you prefer to do :");
                        System.out.println("----------------------------");
                        System.out.println("""
                                    0 For get practice questions
                                    1 For set practice questions
                                    2 For get practice model answer
                                    3 For set practice model answer
                                    """);
                        System.out.println("----------------------------");
                        Toolkit.getDefaultToolkit().beep();
                        int x3 = getRangeInt();
                        if (x3 == 0) {
                            System.out.println("there is the practice questions");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.getPracticeQuestionlist();
                        }
                        if (x3 == 1) {
                            System.out.println("please enter the practice questions");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.setPracticeQuestionlist(questionList);
                        }
                        if (x3 == 2) {
                            System.out.println("there is the practice model answer");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.getPracticeModelAnswer();
                        }
                        if (x3 == 3) {
                            System.out.println("please enter the practice model answer");
                            System.out.println("----------------------------");
                            Toolkit.getDefaultToolkit().beep();
                            newInstructor.setPracticeModelAnswer(modelAnswer);
                        }
                    }
                    //////////////////////////////////////////////////////////////////////////
                    if (x2 == 2) {
                        System.out.println("you are a new instructor so your rate is default zero");
                    }
                    if (x2 == 3) {
                        System.out.println("you are a new instructor so your students is default zero");
                    }
                }
                }
            }
        }
    }
    */

// main with GUI
/*

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets ;
import javafx.geometry.Orientation ;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.Font;
import java.awt.Toolkit;

public class Main extends Application {
	User current= new Student();

	  public static int getInt() {
	    	int x=0 ;
	    	boolean flag = true ;
	    	do {
	    		try {

	    			Scanner scan = new Scanner(System.in) ;
	    			x=scan.nextInt();
	    			flag = false ;

	    	}
	    	catch (InputMismatchException e)
	    		{
	    		System.out.println("Please re-enter positive integer number") ;
	    		}
	    		}
	    	while (flag) ;
	    	return x ;

	    	}
	    public static boolean getBool() {
			boolean x= false ;
			boolean flag = true ;
			do {
				try {

					Scanner scan = new Scanner(System.in) ;
					x=scan.nextBoolean() ;
					flag = false ;

			}
			catch (InputMismatchException e)
				{
				System.out.println("Please re-enter positive true or false") ;
				}
				}
			while (flag) ;
			return x ;

			}

	Boolean userType = true ;    // false is teacher while true is student
	 @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {

		 // the first window
		 database d1 = new database();
		 Pane Userdefi = new Pane() ;
		 //Userdefi.setHgap(10) ;
		 //Userdefi.setVgap(10) ;
		 Userdefi.setPadding(new Insets(10));
		//Text text = new Text()	 ;
		 Scene SceneOne = new Scene(Userdefi,200,200);
		 Text question = new Text("Select user type") ;
		// question.autosize();
		 Userdefi.getChildren().add(question) ;
		 question.setLayoutX(20);
		 question.setLayoutY(50);
		 question.layoutXProperty().bind(SceneOne.widthProperty().divide(2).subtract(50)) ;
		 //question.fontProperty().bind(SceneOne.xProperty());
		 Button teacher = new Button("Teacher") ;

		 teacher.setLayoutX(115);
		 teacher.setLayoutY(125);
		 teacher.layoutXProperty().bind(SceneOne.widthProperty().divide(2));;
		 Button Student = new Button ("Student") ;

		 Student.setLayoutX(25);
		 Student.setLayoutY(125);
		 Student.layoutXProperty().bind(SceneOne.widthProperty().divide(2).subtract(70)) ;
		 Userdefi.getChildren().addAll(teacher, Student) ;
		 primaryStage.setScene(SceneOne);
		 primaryStage.show() ;


		 // the second window

		 	GridPane pane1 = new  GridPane()  ;
			pane1.setVgap(10);
			// pane1.setOpaqueInsets(10,5,6,4);
			TextField email = new TextField();
			Label lbemail = new Label("  E-mail :   ",email);
			lbemail.setContentDisplay(ContentDisplay.RIGHT);
			PasswordField password  = new PasswordField();
			// password field is a class extending text field used in passwords so the text in it is hidden
			Label lbpassword = new Label(" Password : ",password);
			lbpassword.setContentDisplay(ContentDisplay.RIGHT);
			pane1.add(lbemail,1,1);
			pane1.add(email,2,1);
			pane1.add(lbpassword,1 , 2);
			pane1.add(password,2 , 2);
			//noacc.textFormatterProperty(text.s)
			Button lgin = new Button("Login") ;
			pane1.add(lgin, 1, 3);
			Button noacc = new Button("Create new acc") ;
			pane1.add(noacc, 2, 3);

			Scene sceneTwo = new Scene (pane1, 350,200);

			Pane mainp = new Pane();
			Text welcomeMessage = new Text("Welcome, "+current.getName()) ;

			welcomeMessage.setStyle("-fx-font: 18 Serif;") ;

			mainp.getChildren().add(welcomeMessage);
			welcomeMessage.setLayoutX(9);
			welcomeMessage.setLayoutY(19);

			//mainp.setOpaqueInsets(new Insets(50,20,50,50));
			//mainp.setLayoutX(10);
			//mainp.setAlignment(welcomeMessage,Pos.BOTTOM_LEFT);
			Scene scene3 = new Scene(mainp,500,500);
			Stage stage2 = new Stage();
			Button Myprofile = new Button("Myprofile");
			mainp.getChildren().add(Myprofile);
			Myprofile.setPrefSize(80, 40);
			Myprofile.layoutXProperty().bind(scene3.widthProperty().subtract(100));
			Myprofile.setLayoutY(20);//.bind(scene3.widthProperty().subtract(100));
			stage2.setScene(scene3);
			stage2.setTitle("Coursaty main paged");
			stage2.show();

			//Collections.sort(a);

			Text mycourses = new Text("Available Courses");
			mycourses.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
			mainp.getChildren().add(mycourses);
			mycourses.setX(10);
			mycourses.setLayoutY(60);


				Collections.sort(database.CoursesArray)	;
				for (int i=0 ; i< database.CoursesArray.size() ;i++ ) {
				Text x =new Text(database.CoursesArray.get(i).getName()) ;
				x.setStyle("-fx-font: 12 arial;") ;
				mainp.getChildren().add(x);
				//x.xProperty().bind(scene3.widthProperty().subtract(scene3.getWidth()).add(10));
				x.setX(10);
				x.setLayoutY(85+18*i);
				x.setOnMousePressed(e-> {
					Toolkit.getDefaultToolkit().beep();

				});


			}



		/////handling pressing student button

			 class StudHandlerClass  extends Main implements EventHandler<ActionEvent>  {
				    @Override
				public void handle(ActionEvent e) {
				      System.out.println("user is student");
				      userType = true ;
				      primaryStage.setScene(sceneTwo) ;

				      }
			 }
			 StudHandlerClass han1 = new StudHandlerClass()	 ;
			 Student.setOnAction(han1 ) ;


		//// handling pressing the instructor button

			 class TeacherHandler extends Main implements EventHandler<ActionEvent> {
				    @Override

				public void handle(ActionEvent e) {
				      System.out.println("I'm a teacher");
				      userType = false ;
				      primaryStage.setScene(sceneTwo) ;

				    }
				    }
			 TeacherHandler han2 = new  TeacherHandler () ;
			 teacher.setOnAction(han2);



			class LoginHandle  implements EventHandler<ActionEvent> {
				@Override
				public void handle (ActionEvent e) {
					if (current instanceof Student) { // user is student
						 //get info about student / do some operations
						System.out.println("Ehna bnhandle el login status");
				          String instName = email.getText() ;
				          //System.out.println("da esm el user ana a5adto" +  email.getText()+database.StudentsArray.size());
				          int i ;
				          for (i = 0 ; i < database.StudentsArray.size() ; i++) {
				              Student std = (Student) database.StudentsArray.get(i);
				              System.out.println("ana bdwr 3l user") ;
				              if (std.getName().equals(instName)) {
				                  std.PrintInfo();
				                  current = (Student) database.StudentsArray.get(i);
				                  welcomeMessage.setText("Welcome," +current.getName());
				                  primaryStage.close();
				                  stage2.show();
				              }
				              else if (database.StudentsArray.size()==i+1){
				                  System.out.println("you are not a current student");
				                  Label notuser = new Label ("You are not a current user") ;
				                  pane1.add(notuser, 1, 4);
				                 // notuser.setFont(Color.RED)
				              }
				          }
						}
					else
						{
						System.out.println("Ehna bnhandle el login status");
				          String instName = email.getText() ;
				         // System.out.println("da esm el user ana a5adto" +  email.getText()+database.StudentsArray.size());
				          int i ;
				          for (i = 0 ; i < database.InstructorsArray.size()-1 ; i++) {
				              Student std = (Student) database.InstructorsArray.get(i);
				            //  System.out.println("ana bdwr 3l user") ;
				              if (std.getName().equals(instName)) {
				                  std.PrintInfo();
				                  current = (Student) database.InstructorsArray.get(i);
				                  welcomeMessage.setText("Welcome," +current.getName());
				                  stage2.show();
				                  //operations
				              }
				              else if (database.InstructorsArray.size()==i+1){
				                  System.out.println("you are not a current student");
				                  Label notuser = new Label ("You are not a current Instructor") ;
				                  pane1.add(notuser, 1, 4);
				                 // notuser.setFont(Color.RED)
				              }
				          }

						}
					}


} // end of login handle class

			LoginHandle Han3 = new LoginHandle() ;
			lgin.setOnAction(Han3);
			Button signup = new Button("sign up") ;

			class newaccHan  implements EventHandler<ActionEvent> {
				@Override
				public void handle (ActionEvent e) {
					//lgin.setText(STYLESHEET_MODENA);
					pane1.getChildren().remove(lgin);
					pane1.getChildren().remove(noacc);
					pane1.add(signup,3, 5);
					lgin.setText("Sign up");
					TextField age = new  TextField() ;
					Label lbage = new Label(" age  ",age) ;
					lbage.setContentDisplay(ContentDisplay.RIGHT);

					lbage.setAlignment(null);
					pane1.add(lbage,1 , 3);
					//pane1.add(age,3 , 2);


				}


			}
			newaccHan Han4 = new newaccHan();
			noacc.setOnAction(Han4);



	 }



}

 */