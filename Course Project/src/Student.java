import java.util.ArrayList ; 

public class Student extends User {
	
	private  int ID  ;						// This function doesn't have a setter as you can't change your ID 
	private  ArrayList <Course> CoursesEnrolled ; // 
	private float grade ;
	
	public Student() {
	    this.ID = 1000 + getCounter() ;		//
	    incrementCounter ();
	}
	
	public Student(String name) {
	    super(name)  ; 
	    this.ID = 1000 + getCounter() ;		//
	    incrementCounter (); 			//		
	}
	
	public Student(String name , String email ) {
		  super(name,email)  ; 
		   this.ID = 1000+ getCounter() ;		//
		   incrementCounter (); 			//	
	}
	
	public Student (String name , String email ,int age ) {
		  super(name,email , age )  ; 
		   this.ID = 1000+ getCounter() ;		//
		   incrementCounter (); 
	}
	
	
	public int getID() {
		return ID;
	}

	public ArrayList<Course> getCourslist() {
		return CoursesEnrolled;
	}
	
	public Course getCourse (int index)
	{
		return this.CoursesEnrolled.get( index ) ; 
	}
	
	public float getGrade() {
		return grade;
	}
	
	/*public void setGrade(float grade) {
		this.grade = grade;
	}*/    //grade shouldn't be setted 

}
