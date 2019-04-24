package collections;

import java.util.*;
import java.util.Map.Entry;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> num = new ArrayList<String>();
		num.add("1");
		num.add("1");
		num.add("3");
		num.add("4");
		num.add("5");
		Collections.sort(num);		//using collection classS

		System.out.println("arraylist"+num.toString());  
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(1);
		ll.addFirst(4);
		ll.addLast(7);
		Iterator<Integer> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Set<String> hset =new HashSet<String>(num);
		hset.add("1");
		hset.add("1");
		hset.add("3");
		hset.add("99");
		hset.add("4");
		hset.add("5");
		Iterator<String> it1 = hset.iterator();
		System.out.println("iterating hashset");
		while(it1.hasNext()) {
			System.out.print(it1.next());	//not maintains order
		Set<String> lhset = new LinkedHashSet<String>();
		lhset.add("1");
		lhset.add("1");
		lhset.add("3");
		lhset.add("4");
		lhset.add("5");
		System.out.println("LinkedHashSet"+lhset.toString()); //LinkedHashSet maintains order
		Set<String> tset = new TreeSet(hset);
		Iterator<String> it11 = tset.iterator();
		System.out.println("iterating TreeSet");
		while(it11.hasNext()) {
			System.out.print(it11.next());	//sorted in ascending order		
			}
		removeDuplicates(num);
		countWords("Hi How are you what are you doing");
		queue();
		
	}


		
		
	}

	private static void queue() {
		System.out.println("priority queue");
		PriorityQueue<String> queue=new PriorityQueue<String>();  //it does not maintain FIFO order
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
	
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  
	

	private static void countWords(String string) {
		// TODO Auto-generated method stub
		String [] sl = string.split(" ");
		 Map<String, Integer> m = new HashMap<String, Integer>();

	    
	        for (String a : sl) {
	            Integer freq = m.get(a);
	            m.put(a, (freq == null) ? 1 : freq + 1);
	        }
	        
	        Iterator<Entry<String, java.lang.Integer>> itr = m.entrySet().iterator(); 
	          System.out.println("Printing hasmap");
	        while(itr.hasNext()) 
	        { 
	             Entry<String, java.lang.Integer> entry = itr.next(); 
	             System.out.println( entry.getKey() +" repeats "  
	                                  + entry.getValue()); 
	    }
	   	 Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();

	        
	        for (String a : sl) {
	            Integer freq = lhm.get(a);
	            lhm.put(a, (freq == null) ? 1 : freq + 1);
	        }
	        
	        Iterator<Entry<String, java.lang.Integer>> itr1 = lhm.entrySet().iterator(); 
	          System.out.println("Printing LinkedHasMap");
	        while(itr1.hasNext()) 
	        { 
	             Entry<String, java.lang.Integer> entry = itr1.next(); 
	             System.out.println( entry.getKey() +" repeats "  
	                                  + entry.getValue()); 
	    }
		
	}

	private static void removeDuplicates(List<String> num) {
		// TODO Auto-generated method stub
		Set<String> set =new HashSet<String>(num);
		System.out.println(set.toString());
		
	}

}
