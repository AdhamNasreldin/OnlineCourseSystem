public abstract class User  {

    private String name ;
    private String Gender ;
    private String mail ;
    private static int Counter = 1 ;  // static int to generate number of objects
    private int age ;
    private int rating ;
    private float grade ;
    private boolean type ; // true if student false if instructor 

    public User() { // constructor default
    }

    public User(String name) { // constructor sryy3

        this.name =name ;
    }


    public User (String name, String Gender, String mail,int age  ) { // constructor main
        this.name=name ;
        this.Gender=Gender;
        this.mail=mail ;
        this.age=age ;
    }


    public boolean getType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public static int getCounter() {

        return Counter ;
    }

    public static void incrementCounter()
    {
        Counter+=1 ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public float getGrade() {
        return grade;
    }
    public void setGrade(float grade) {
        this.grade = grade;
    }

    public abstract void PrintInfo();

}