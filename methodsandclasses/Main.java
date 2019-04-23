package methodsandclasses;

public class Main {
	 public static void main(String[] args) {
		 Bicycle bi= new Bicycle();
		 Mountainbike mb = new Mountainbike();
		 bi.setCadence(10);
		 bi.setGear(2);
		 bi.setSpeed(40);
		 bi.setId(1);
		 bi.setNumberOfBicycles(20);
		// mb.seatCapacity=3;  					// final variables not able to change
		 
		 Bicycle bi1=mb.printBikedetails(bi);  //passing object as parameter
		 System.out.println("returned obj :"+bi1.toString());
		 System.out.println("b1 obj"+bi.toString() );  //since noOfBicycles is static both the objects will have same value
		 
		 factorial(5);
		 sum(1,2,3,4,5);
		 OuterClass oc= new OuterClass();							//outer class object
		 OuterClass.InnerClass innerObject = oc.new InnerClass(); //creating inner class object using outer class object
	        innerObject.display(); 
	
		 
	 }

	final static void sum(Integer ... n) {  //variable length arguments
		for(int a:n) {
			System.out.println(a);
		}
	}
	
	private static int factorial(int n) {
		if (n != 0)
        return n * factorial(n-1); // recursive call
    else
        return 1;
		
	}
	 
}
class OuterClass 
{  
    // static member 
    static int outer_x = 10; 
      
    // instance(non-static) member 
    int outer_y = 20; 
      
    // private member 
    private int outer_private = 30; 
      
    // inner class 
    class InnerClass 
    { 
        void display() 
        { 
            // can access static member of outer class 
            System.out.println("outer_x = " + outer_x); 
              
            // can also access non-static member of outer class 
            System.out.println("outer_y = " + outer_y); 
              
            // can also access private member of outer class 
            System.out.println("outer_private = " + outer_private); 
          
        } 
    } 
} 

