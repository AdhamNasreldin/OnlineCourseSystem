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