package Threads;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Synchronized threads
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
		//Creating multiple Threads
		Runnable t1=new threadDemo();
		Thread t2 = new threadDemo1();
		try {
			System.out.println(t2.isAlive());		//using isAlive to check the status
			System.out.println("Waiting for threads to finish");
			t2.join();
			
			} 
		catch (InterruptedException e) 
			{

				System.out.println("Main thread interrupted.");
			}
		System.out.println("thread status"+t2.isAlive());
			System.out.println("Main thread exiting .");
			}
}

	class Q {
		int n;
		boolean valueSet = false;
		synchronized int get() {
		while(!valueSet)
		try {
			wait();
		} 
		catch(InterruptedException e) 
		{
			System.out.println("InterruptedException caught");
		}
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
		}
		synchronized void put(int n) {
			while(valueSet)
			try {
				wait();
			} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
			}
			this.n = n;
			valueSet = true;
			System.out.println("Put: " + n);
			notify();
			}
	
	synchronized void getput(int n) {
		while(valueSet)
		try {
			wait();
		} catch(InterruptedException e) {
		System.out.println("InterruptedException caught");
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
		}
}
	class Producer implements Runnable {  		//thread class with runable interface
		Q q;
		Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
		}
		public void run() {
		int i = 0;
		while(true) {
		q.put(i++);
		if(i==10) {
			break;
		}
		}
		}
	}
	class Consumer implements Runnable {
		Q q;
		Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
		}
		public void run() {
		while(true) {
		q.get();
		}
		}
	}
	class threadDemo implements Runnable{  //Thread class runnable interface
		Thread t;
		threadDemo(){
			t=new Thread(this, "DemoThread");
			System.out.println(t.getName());
			t.start();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i=5; i > 0; i--) {
				System.out.println("ThreadDemo"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	class threadDemo1 extends Thread{		//Extending thread
		threadDemo1(){
			super("Demo Thread");			//creating a new second thread
			System.out.println(getName());
			start();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
		
			for(int i = 5; i > 0; i--) {
				System.out.println("ThreadDemo1"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	

	
	
