package methodsandclasses;

public class Bicycle {
    //Encapsulation
    private int cadence;
    private int gear;
    private int speed;   //private variables can access only within the class
    private int id;
    static int numberOfBicycles = 10; 
  

	public int getCadence() {
		return cadence;
	}
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getNumberOfBicycles() {
		return numberOfBicycles;
	}
	public static void setNumberOfBicycles(int numberOfBicycles) {
		Bicycle.numberOfBicycles = numberOfBicycles;
	}
	
	final void print() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Bicycle [cadence=" + cadence + ", gear=" + gear + ", speed=" + speed + ", id=" + id +", numberOfBicycles="+numberOfBicycles+ "]";
	}

    
}
final class Mountainbike extends Bicycle{
	 protected double seatheight=2.5;	// access only to methods and classes
	 String brand;					//default variables
	 final int seatCapacity=2;		// final variable cannot be change
	
	/**
	 * @param seatheight
	 * @param brand
	 */
	 public Mountainbike() {
		 super();
	 }
	public Mountainbike(double seatheight, String brand) { //constructors overloading
		super();
		this.seatheight = seatheight;
		this.brand = brand;
	}

 
	
	public Bicycle printBikedetails(Bicycle b){   				//returning objects
		System.out.println(b.toString()+", seatheight : " +seatheight);
		 Bicycle bi= new Bicycle();
		 bi.setCadence(20);
		 bi.setGear(4);
		 bi.setSpeed(50);
		 bi.setId(2);
		 bi.setNumberOfBicycles(5);
		
		return bi;
		
	}
	   // FINAL method cannot override	
//		public void print() {
//			
//		}
		
}
		//FINAL class cannot inherit

//class MountainRaceBike extends Mountainbike{
//	System.out.println("MountainRaceBike");
//}
