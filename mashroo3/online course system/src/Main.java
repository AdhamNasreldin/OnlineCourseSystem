import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Toolkit;
public class Main {
    static ArrayList<Object> InstructorsArray = new ArrayList<>();
    static ArrayList<Object> StudentsArray = new ArrayList<>();
    static ArrayList<Object> CoursesArray = new ArrayList<>();
    
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

    public static void main(String[] args) {

        // initialize array of object contains current instructors
        Instructor instructor1 = new Instructor("english", "ahmed", "male", "mail", 55);
        Instructor instructor2 = new Instructor("arabic", "ibrahim", "male", "mail", 30);
        Instructor instructor3 = new Instructor("math", "ali", "male", "mail", 40);
        InstructorsArray.add(instructor1);
        InstructorsArray.add(instructor2);
        InstructorsArray.add(instructor3);

        // initialize array of object contains current Students
        Student s1 = new Student("ahmed", "male", "ahmed@gmail.com", 20);
        Student s2 = new Student("kareem", "male", "ahmed@gmail.com", 20);
        Student s3 = new Student("adham", "male", "ahmed@gmail.com", 20);
        StudentsArray.add(s1);
        StudentsArray.add(s2);
        StudentsArray.add(s3);
        s1.setRating(9);
        s2.setRating(8);
        s3.setRating(10);

        // initialize array of object contains current Courses
        Courses c1 = new Courses("english", 10, 100, "12 lectures");
        Courses c2 = new Courses("arabic", 12, 101, "10 lectures");
        Courses c3 = new Courses("math", 13, 102, "15 lectures");
        CoursesArray.add(c1);
        CoursesArray.add(c2);
        CoursesArray.add(c3);

        //Arraylists
        ArrayList<String> modelAnswer = new ArrayList<>();
        ArrayList<String> questionList = new ArrayList<>();


        //main function
        System.out.println("Hello to NINJA online courses application");
        System.out.println("-------------------------------------------");
        System.out.println("Are you STUDENT / INSTRUCTOR ?\n" + "---------------------------------\n" + "for INSTRUCTOR enter 0\n" + "for STUDENT enter 1\n");
        Toolkit.getDefaultToolkit().beep();
        Scanner in = new Scanner(System.in);
        Boolean x = in.nextBoolean();

        //check if Student\Instructor
        if (x == true ) {

            System.out.println("hello student");
            System.out.println("-----------------------------");
            System.out.println("Are you new student or current student\n" + "---------------------------------\n" + "for CURRENT student enter 0\n" + "for NEW student enter 1\n");
            System.out.println("-----------------------------");
            Toolkit.getDefaultToolkit().beep();
            int xx = getInt();

            if (xx == 0) {

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
            else if (xx == 1) {

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

            //check if current\new instructor
        }
        /////////////////////////////////////////////////////////
        else if (x == false) {
            System.out.println("hello instructor");
            System.out.println("-----------------------------");
            System.out.println("Are you new instructor or current instructor\n" + "---------------------------------\n" + "for CURRENT INSTRUCTOR enter 0\n" + "for NEW INSTRUCTOR enter 1\n");
            System.out.println("-----------------------------");
            Toolkit.getDefaultToolkit().beep();
            int x1 = getInt();

            if (x1 == 0) {

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
            else if (x1 == 1) {
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
        else {
            System.out.println("please enter 1 or 0");
            Toolkit.getDefaultToolkit().beep();
        }
    }
}