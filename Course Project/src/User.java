public abstract class User {
	
	private String name ;
	private String Gender ;
	private String mail ; 
	private static int Counter = 1 ;  // static int to generate number 
	//public String Nationaliy ;
	private int age ;
	
	public User() {	
	}
	public User(String name) {
		
		this.name =name ; 
	}
	public User (String name,String mail ) {
	  this(name) ;
	  this.mail=mail ; 
	}
	
	public User (String name, int age ) {
		  this(name) ;
		  this.age=age ; 
	}
	public User (String name, String mail , int age ) {
		this(name, age) ; 
		this.mail=mail ; 
		
	}
		
	public static int getCounter() {
		return Counter ;
	}
	//public static void setCounter(int Counter) {
	//	ID = this.Counter; 
	//}
	public static void incrementCounter()
	{
		Counter+=1 ;
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	
	

}
