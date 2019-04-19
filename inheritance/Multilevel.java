package inheritance;

public class Multilevel {
	 public static void main(String args[]) {
		 	Child ch = new Child();
		 	Parent pa = new Parent();
		 	ch.fatherName="a";
		 	ch.motherName="b";
		 	ch.fName="c";
		 	ch.mName="d";
		 	ch.firstName="f";
		 	ch.lastName="g";
		 //	ch.marriedAt=12; // final field cannot inherit
		 	System.out.println(ch.toString());
		 	System.out.println(ch.address());
		 	System.out.println(pa.toString());
		 	System.out.println(pa.address());
		 	System.out.println(pa.address("a"));
		 	System.out.println(pa.combinedName());
		 	
		 }

}

/*   Using Abstract class */
abstract class ab{  
	  abstract String combinedName();  
	} 

 class Grandparents extends ab {
	String fName;
	String mName;
	final int marriedAt= 1995;

	public Grandparents() {
		System.out.println("Grandparents default constructor called");
	}
	public Grandparents(String fName, String mName) {
		super();
		this.fName = fName;
		this.mName = mName;
	}
	public String address() {
	String address = "plot no 1";
	return address;
	}
	final String place() {
		return "chennai";
	}
	public String combinedName() { // Using Abstract Class methods
		// TODO Auto-generated method stub
		System.out.println(this.fName+this.mName);
		return this.fName+this.mName;
	}
	public String combined() {
		// TODO Auto-generated method stub
		System.out.println(this.fName+this.mName);
		return this.fName+this.mName;
	
	
}
 
 }
 class Parent extends Grandparents {
	String motherName;
	String fatherName;
	public Parent(){
		super();   //   Using super to Call Superclass 
		System.out.println("Parent class Default constructor called");
	}
	public Parent(String motherName, String fatherName) {
		super();
		String a=super.mName; //A Second Use for super (call Superclass members)
		System.out.println(a);
		this.motherName = motherName;
		this.fatherName = fatherName;
	}
	
	@Override
	public String toString() {
		return "Parent [motherName=" + motherName + ", fatherName=" + fatherName + "]";
	}
	public String address() { // Method Overriding | Dynamic binding
	String address = "plot no 2";
	return address;
	}
	public int address(String a) { //static binding
		int v=10;
		return v;
	}
	public String combined() {
		// TODO Auto-generated method stub
		System.out.println(this.motherName+this.fatherName);
		return this.fName+this.mName;
	}
	
	// Unable to override final method
//	final String place() { 
//		
//		return "Poondy";
//	}
    
}

class Child extends Parent {
 	String firstName;
 	String lastName;
 	
 	public Child() {
 		super();
 		System.out.println("child class Default constructor called");
 	}
 	public Child(String motherName, String fatherName, String firstName, String lastName) {
 		super(motherName, fatherName);
 		this.firstName = firstName;
 		this.lastName = lastName;
 	}
 	public String address() { //Method Overriding
 		
 		
 	String address = "plot no 3";
 	return address;
 	}


 @Override
 	public String toString() {
 		return "Child [firstName=" + firstName + ", lastName=" + lastName + ", motherName=" + motherName
 				+ ", fatherName=" + fatherName + ", fName=" + fName + ", mName=" + mName + ", getClass()=" + getClass()
 				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
 	}
}
