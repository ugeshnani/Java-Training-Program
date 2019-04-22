package operators;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		int i =0;   //assignment operators
		int a=20;
		int b=30;
		int c[]= {1,2,3,4,5,6};
	Calculator cl= new Calculator();
		System.out.println("sum : "+Calculator.add(a,b,i));
		System.out.println("sub : "+Calculator.sub(a,b,i));
		System.out.println("mul : "+Calculator.mul(a,b,i));
		System.out.println("div : "+Calculator.div(a,b));
		System.out.println("mod : "+Calculator.mod(a,b));
		System.out.println("max : "+Calculator.max(c));
		System.out.println();
		System.out.println("cl obj is instance of Calculator : "+(cl instanceof Calculator));  //The Type Comparison Operator instanceof
		System.out.println("grt : "+cl.grt(a,b));

		int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))  //Conditional operators && ||
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
        
        //Bitwise logical operators
        
        System.out.println("a&b = " + (a & b)); 
        System.out.println("a|b = " + (a | b)); 
        System.out.println("a^b = " + (a ^ b)); 
        System.out.println("~a = " + ~a); 
        a &= b; 
        System.out.println("a= " + a); 
		// Bitwise left right and unsigned shift operators
        System.out.println("a >>1 :"+(a>>1));
        System.out.println("a <<1 :"+(a<<1));
        System.out.println("b >>>1 :"+(b>>>1));
        System.out.println(2*2+4-3*5/3);  //operator precedence 
	}
	
	}
class Calculator{
	public static int add(int... integers) {
		int b=0;
		int i=0;
		for(int a:integers) {
			i=i++;			//Unary operator ++ -- ! + -
			b+=a;			// compound Assignment operator
		}
		System.out.println("no of values add"+i);
			return b;}
	public static int sub(int... integers) {
				int b=0;
				for(int a:integers) {
					b=b-a;
				}
					return b;
					}
	public static int mul(int... integers) {
			int b=0;
			for(int a:integers) {
				b=b*a;
			}
				return b;
				}
	public static int div(int a, int b) {
			int c=0;
			c=a/b;
		return b;
		}	
	public static int mod(int a, int b) {
		int c=0;
		c=a%b;
	return b;
	}	
	public static int max(int a[]) {
		//Arrays.sort(a);
		//int len=a.length;	
		int max=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i;j<=a.length-1;j++) {
				if (a[i]>=a[j]) {    //Relational and conditional operators
					max=a[j];
				}
				
			}
		}
	return max;}	
	public int grt(int a, int  b) {
		int c=a>b ?a : b;			 //ternary operator 
		return c;
		
	}
	}


