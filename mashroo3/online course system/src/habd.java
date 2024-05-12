import java.awt.Toolkit;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/*class StudHandlerClass  extends Main implements EventHandler<ActionEvent>  {
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
          for (int i = 0; i < database.StudentsArray.size(); i++) {
              Student std = (Student) database.StudentsArray.get(i);
              if (std.getName().equals(instName)) {
                  std.PrintInfo();
                  Student currentStudent = (Student) database.StudentsArray.get(i);
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
  }*/
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
          for (int i = 0; i < database.InstructorsArray.size(); i++) {
              Instructor ins = (Instructor) database.InstructorsArray.get(i);
              if (ins.getName().equals(instName)) {
                  ins.PrintInfo();
                  Instructor currentInstructor = (Instructor) database.InstructorsArray.get(i);
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
                          currentInstructor.setQuizzQuestionlist(database.questionList);
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
                          currentInstructor.setQuizzModelAnswer(database.modelAnswer);
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
                          currentInstructor.setPracticeQuestionlist(database.questionList);
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
                          currentInstructor.setPracticeModelAnswer(database.modelAnswer);
                      }
                     
                  }
                  //////////////////////////////////////////////////////////////////////////
                  if (x2 == 2) {
                      int rate = 0;
                      for (int y = 0; y < database.StudentsArray.size(); y++) {
                          Student s = (Student) database.StudentsArray.get(y);
                          rate += s.getRating();
                      }
                      System.out.println("your rating is :" + (rate / database.StudentsArray.size()));
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