package inheritance; 
	
public class Hierarchical {
	public static void main(String[] args) 
	{ 
		three g = new three(); 
		g.print_one(); 
		two t = new two(); 
		t.print_one(); 
		//g.print_two();//not able call class two methods with class three objects
		} 
	
}
	class one 
	{ 
		public void print_one() 
		{ 
			System.out.println("one"); 
		} 
	} 

	class two extends one 
	{ 
		public void print_two() 
		{ 
			System.out.println("two"); 
		} 
	} 

	class three extends one 
	{ 
		/*............*/
	} 
