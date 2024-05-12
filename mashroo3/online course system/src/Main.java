import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets ;
import javafx.geometry.Orientation ;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.awt.Toolkit;

public class Main extends Application {
	User current ;
	
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
		 Button Studen = new Button ("Student") ; 
		
		 Studen.setLayoutX(25);
		 Studen.setLayoutY(125); 
		 Studen.layoutXProperty().bind(SceneOne.widthProperty().divide(2).subtract(70)) ;
		 Userdefi.getChildren().addAll(teacher, Studen) ;
		 primaryStage.setScene(SceneOne);
		 primaryStage.setTitle("User type");
		 primaryStage.show() ; 
		 
		
		 // the second window 
		 
		 	GridPane pane1 = new  GridPane()  ;
			pane1.setVgap(10);
			pane1.setHgap(10);
			// Assume 'gridPane' is the GridPane you want to set the border width for
			// Set the border width using CSS
			pane1.setStyle("-fx-border-width: 2px; -fx-border-color: black;");
			// by copilot

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
			//sceneTwo.
			
			
			
			
		/////handling pressing student button 
			 
			 class StudHandlerClass  extends Main implements EventHandler<ActionEvent>  {
				    @Override 
				public void handle(ActionEvent e) {
				      System.out.println("user is student");
				      userType = true ;
				      current = new Student(); 
				      primaryStage.setScene(sceneTwo) ;     
				      
				      }
			 }
			 StudHandlerClass han1 = new StudHandlerClass()	 ; 
			 Studen.setOnAction(han1 ) ; 
			 
			 
		//// handling pressing the instructor button 
			 
			 class TeacherHandler extends Main implements EventHandler<ActionEvent> {
				    @Override

				public void handle(ActionEvent e) {
				      System.out.println("I'm a teacher");
				      userType = false ;
				      current = new Instructor (); 
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
				          System.out.println("da esm el user ana a5adto" +  email.getText()+database.StudentsArray.size());
				          int i ;
				          try {
				          for (i = 0 ; i <= database.StudentsArray.size()-1 ; i++) {
				              Student std = (Student) database.StudentsArray.get(i);
				              System.out.println("ana bdwr 3l user") ;
				              if (std.getName().equals(instName)) {
				                  std.PrintInfo();
				                   current = (Student) database.StudentsArray.get(i);
				                  Label auser = new Label ("Congrats you are logged in") ;
				                  pane1.add(auser, 1, 4);				                 
				              }
				              else if (database.StudentsArray.size()==i+1){
				                  System.out.println("you are not a current student");
				                  Label notuser = new Label ("You are not a current user") ;
				                  pane1.add(notuser, 1, 4);
				                 // notuser.setFont(Color.RED)    
				              }
				          }}catch(IndexOutOfBoundsException k) {
				        	  Label notuser = new Label ("You are not a current user") ;
			                  pane1.add(notuser, 1, 4);
				          }
				          
						} 
					else 
						{
						System.out.println("Ehna bnhandle el login status");
				          String instName = email.getText() ;
				          System.out.println("da esm el user ana a5adto" +  email.getText()+database.StudentsArray.size());
				          int i ; 
				          for (i = 0 ; i < database.StudentsArray.size()-1 ; i++) {
				              Student std = (Student) database.StudentsArray.get(i);
				              System.out.println("ana bdwr 3l user") ;
				              if (std.getName().equals(instName)) {
				                  std.PrintInfo();
				                  current = (Instructor) database.InstructorsArray.get(i);
				                  Label auser = new Label ("Congrats you are logged in") ;
				                  pane1.add(auser, 1, 4);
				                  System.out.println("what operation do you prefer to do :");
				                  System.out.println("----------------------------");
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
			
			class newaccHan  implements EventHandler<ActionEvent> {
				@Override 
				public void handle (ActionEvent e) {
					//lgin.setText(STYLESHEET_MODENA);
					pane1.getChildren().remove(lgin);
					pane1.getChildren().remove(noacc);
					pane1.add(lgin,3, 5);
					lgin.setText("Sign up");
					TextField age = new  TextField() ;
					Label lbage = new Label(" age  ",age) ; 
					lbage.setContentDisplay(ContentDisplay.RIGHT);	

					lbage.setAlignment(null);
					pane1.add(lbage,1 , 3);
					pane1.add(age,3 , 2);
					
					
					
					
				}
				
			
			}
			newaccHan Han4 = new newaccHan();
			noacc.setOnAction(Han4);
			
			
	 }//closing the start methid implementation
	 }
