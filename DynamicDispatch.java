class Human{
    private int age;
    private String name;

    public Human(int aga, String name){
	this.age = age;
	this.name = name;
    }
    public void eat(){
	System.out.println("Human is eating");
    }
    public void study(String str){
	System.out.println("Studying");
    }
}

class Student extends Human{
    public Student(int age, String name){
	super(age, name);
    }
    public void eat(){
	System.out.println("Student is eating");
	
    }
    public void study(String subject){
	
	System.out.println("Student is studying: " + subject);
    }
    
}

public class DynamicDispatch{
    public static void main(String[] args){
	Human hm = new Student(20, "Abebe");
	hm.eat();
	hm.study("Mathematics");

	
    }
}
