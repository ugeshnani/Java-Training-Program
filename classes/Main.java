package classes;

public class Main {

	 public static void main(String[] args) {

	        // Create two different 
	        // Bicycle objects
		 	new Bicycle().cadence=20;  //use object without reference variable
	        Bicycle bike1 = new Bicycle();// Assigning Object to Reference Variables
	        Bicycle bike2 = new Bicycle();
	        Bicycle bike3=bike2; //copy of object

	        // Invoke methods on 
	        // those objects
	        bike1.changeCadence(50);
	        bike1.speedUp(10);
	        bike1.changeGear(2);
	        bike1.printStates();
	        
	        bike2.changeCadence(50);
	        bike2.speedUp(10);
	        bike2.changeGear(2);
	        bike2.changeCadence(40);
	        bike2.speedUp(10);
	        bike2.changeGear(3);
	        bike2.printStates();
	        bike3.printStates();  //this will print bike2 state
	        System.out.println("Current speed of bike3 :"+bike3.currentSpeed()); //currentSpeed() method will return current speed of bike
	       // Runtime.getRuntime().runFinalization();
	        System.gc(); //we can call finalize method explicitly
	        bike3.checkMaxSpeed();
	        System.out.println("speed of bike at stop :"+bike3.stopBike(40));
	        

	}
	 
}
class Bicycle {
	
	//global variables
   public int cadence;
   public int speed;
   public int gear;
   final float milage= (float) 40.0; //type casting
   static boolean twoWheeler ;
   {					//initialization with blocks of code
	   cadence =0;
	   speed=0;
	   gear=0;
   }
   static {				//static initialization
	   twoWheeler=true;
   }
    
//constructors 
    public Bicycle() {
    	System.out.println("Default constructor");
    }


	void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
    	
    	switch (newValue){ //Switch case for assigning gear value 
    	case 1:
    		gear=1; 
    		break;			//using break
    	case 2:
			gear=2;
			break;
    	case 3:
			gear=3;
			break;
    	case 4:
			gear=4;
			break;
    	case 5:
			gear=5;
			break;
		default:
			gear=0;
			break;
    	}
    }

    void speedUp(int increment) {
    	if (speed >= 100) {
    		System.out.println("Bike running at Max speed");	
    	}
    	else {
         speed = speed + increment;       
    	}
    }
    void applyBrakes(int decrement) {
    	if (speed == 0) {
    		System.out.println("Bike running at Max speed");	
    	}
    	else {
         speed = speed - decrement;
    	}
    }
    public int currentSpeed()
    {
    	return speed;
    }
    public int checkMaxSpeed()
    {
    	int i =10;    		//local variables
    	while(speed ==100) { 		//iteration statements(while loop)
    		speed=speed+i;
    	}
    	
    	return speed;
    }
   
    public int stopBike(int a) {
    	
    	do {
    		a=a-10; //iteration statements(do while loop)
    		//a=a-i; //i cannot be resolved to a variable since it is declared as local variable we can't use it outside
    	}
    	while(a>=10);
    	System.out.println(a);
    	return a;
    }
    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
    protected void finalize() throws Throwable // we can override finalize method  to do operation before object is destroyed
    {
        System.out.println("From Finalize Methood");
   
        //Calling super class finalize() method explicitly
        super.finalize();	
    
    }
    
}