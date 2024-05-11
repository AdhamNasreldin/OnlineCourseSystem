import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.Toolkit;

public class Main extends Application {
	

    
    
	 @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	  // Create a pane and set its properties
		 
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
		 TeacherHandler han2 = new  TeacherHandler () ; 
		 teacher.setOnAction(han2);
		
		 teacher.setLayoutX(115);
		 teacher.setLayoutY(125);
		 teacher.layoutXProperty().bind(SceneOne.widthProperty().divide(2));;
		 Button Student = new Button ("Student") ; 
		 StudHandlerClass han1 = new StudHandlerClass()	 ; 
		 Student.setOnAction(han1 ) ; 
		 Student.setLayoutX(25);
		 Student.setLayoutY(125); 
		 Student.layoutXProperty().bind(SceneOne.widthProperty().divide(2).subtract(70)) ;
		 Userdefi.getChildren().addAll(teacher, Student) ;
		// Scene SceneOne = new Scene(Userdefi,200,200);
		 primaryStage.setScene(SceneOne);
		 primaryStage.show();
		 Pane pane2 = new Pane() ; 
		 Scene scene2 = new Scene(pane2, 200 ,200 ) ; 
		 
		 
		
		 
		 
		 
		 
	//	primarystage.setscene(Userdef);  
		 FlowPane pane = new FlowPane();
	  	  pane.setOrientation(Orientation.VERTICAL);
	       pane.setPadding(new Insets(10,10,10,10));
	       pane.setHgap(5);
	       pane.setVgap(5);
	       pane.getChildren().addAll(new Label ("First Name:"),new TextField(),new Label("Middle name:"),new TextField () ) ;
	       Button btac = new Button("create") ; 
	       pane.getChildren().add(btac) ;
	      // Scene scene = new Scene(pane, 500 ,500) ; 
	 // Place the scene in the stage
	       primaryStage.setTitle("Coursaty"); ;
	      // primaryStage.setScene(scene);
	       primaryStage.show(); // Display the stage
	    } 
	   


	    
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

	    //public static void main(String[] args) {
	  

	       

}


class StudHandlerClass  extends Main implements EventHandler<ActionEvent>  {
    @Override 
public void handle(ActionEvent e) {
      System.out.println("user is student");
      System.out.println("hello student");
      System.out.println("-----------------------------");
      System.out.println("Are you new student or current student\n" + "---------------------------------\n" + "for CURRENT student enter false \n" + "for NEW student enter true\n");
      System.out.println("-----------------------------");
      Toolkit.getDefaultToolkit().beep();
      boolean xx = getBool();

      if (xx == false ) {

          //get info about student / do some operations
          System.out.println("Enter your name");
          System.out.println("-----------------------------");
          Toolkit.getDefaultToolkit().beep();
          Scanner in1 = new Scanner(System.in);
          String instName = in1.nextLine();
          for (int i = 0; i < StudentsArray.size(); i++) {
              Student std = (Student) StudentsArray.get(i);
              if (std.getName().equals(instName)) {
                  std.PrintInfo();
                  Student currentStudent = (Student) StudentsArray.get(i);
                  System.out.println("what operation do you prefer to do :");
                  System.out.println("----------------------------");
                  //operations
              }
              else{
                  System.out.println("you are not a current student");
              }
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
          Toolkit.getDefaultToolkit().beep();
          int std_age = getInt();
          System.out.println("enter your mail \n");
          Toolkit.getDefaultToolkit().beep();
          in4.nextLine();
          String std_mail = in4.nextLine();
          System.out.println("enter your gender \n");
          Toolkit.getDefaultToolkit().beep();
          String std_gender = in4.nextLine();

          Student newstudent = new Student(std_name, std_gender, std_mail, std_age);
          newstudent.PrintInfo();
      }

      ///////////////////////////////////////////////////////////////////////////////////////////////////////////


     }
  }
class TeacherHandler extends Main implements EventHandler<ActionEvent> {
    @Override

public void handle(ActionEvent e) {
      System.out.println("I'm a teacher");
      System.out.println("hello instructor");
      System.out.println("-----------------------------");
      System.out.println("Are you new instructor or current instructor\n" + "---------------------------------\n" + "for CURRENT INSTRUCTOR enter 0\n" + "for NEW INSTRUCTOR enter 1\n");
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
          for (int i = 0; i < InstructorsArray.size(); i++) {
              Instructor ins = (Instructor) InstructorsArray.get(i);
              if (ins.getName().equals(instName)) {
                  ins.PrintInfo();
                  Instructor currentInstructor = (Instructor) InstructorsArray.get(i);
                  System.out.println("what operation do you prefer to do :");
                  System.out.println("----------------------------");
                  System.out.println("0 For Quizzez\n" + "1 For Practice\n" + "2 For show rating");
                  System.out.println("----------------------------");
                  Toolkit.getDefaultToolkit().beep();
                //  Scanner in2 = new Scanner(System.in);
                  int x2 = getInt();
                  //////////////////////////////////////////////////////////////////////////
                  if (x2 == 0) {
                      //quizzes operations
                      System.out.println("what operation do you prefer to do :");
                      System.out.println("----------------------------");
                      System.out.println("0 For get quiz questions\n" + "1 For set quiz questions\n " + "2 For get quiz model answer\n" + "3 For set quiz model answer\n");
                      System.out.println("----------------------------");
                      Toolkit.getDefaultToolkit().beep();
                     // Scanner in3 = new Scanner(System.in);
                      int x3 = getInt();
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
                      System.out.println("0 For get practice questions\n" + "1 For set practice questions\n " + "2 For get practice model answer\n" + "3 For set practice model answer\n");
                      System.out.println("----------------------------");
                      Toolkit.getDefaultToolkit().beep();
                     // Scanner in3 = new Scanner(System.in);
                      int x3 = getInt();
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
                      for (int y = 0; y < StudentsArray.size(); y++) {
                          Student s = (Student) StudentsArray.get(y);
                          rate += s.getRating();
                      }
                      System.out.println("your rating is :" + (rate / StudentsArray.size()));
                      Toolkit.getDefaultToolkit().beep();
                  }
                  break;
              } else {
                  System.out.println("you are not a current instructor");
                  Toolkit.getDefaultToolkit().beep();
              }
          }


      }
      ///////////////////////////////////////////////////////////
      else if (x1 == true) {
          Scanner in4 = new Scanner(System.in);
          Instructor newinstructor = new Instructor();

          System.out.println("\n hi instructor \n");
          System.out.println("enter your name \n");
          Toolkit.getDefaultToolkit().beep();
          String ins_name = in4.nextLine();
          System.out.println("enter your age \n");
          Toolkit.getDefaultToolkit().beep();
          int ins_age = getInt();
          System.out.println("enter your mail \n");
          Toolkit.getDefaultToolkit().beep();
          in4.nextLine();
          String ins_mail = in4.nextLine();
          System.out.println("enter your gender \n");
          Toolkit.getDefaultToolkit().beep();
          String ins_gender = in4.nextLine();
          System.out.println("enter your course name \n");
          Toolkit.getDefaultToolkit().beep();
          String course_name = in4.nextLine();

          Instructor newInstructor = new Instructor(course_name, ins_name, ins_gender, ins_mail, ins_age);


          System.out.println("enter your course hours \n");
          Toolkit.getDefaultToolkit().beep();
          int course_hours = getInt();
          System.out.println("enter your course code \n");
          Toolkit.getDefaultToolkit().beep();
          int course_code = getInt();
          System.out.println("enter your course content \n");
          Toolkit.getDefaultToolkit().beep();
          in4.nextLine();
          String course_content = in4.nextLine();

          Courses newCourse = new Courses(course_name, course_hours, course_code, course_content);
          newCourse.getCourseInfo();

          newInstructor.PrintInfo();
          newCourse.getCourseInfo();
      } else {
          System.out.println("Enter a valid number");
      }
  }
  /////////////////////////////////////////////////////////////////
  
}

 
	

//--module-path "C:\Users\PC\Downloads\JavaFx\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib" --add-modules javafx.controls,javafx.graphics,javafx.fxml