

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.util.Scanner;

// custom exception class
class InvalidNumberException extends Exception 
{ 
	InvalidNumberException(String s){ 
		  super(s);
		  System.out.println(s);
		 }  
} 
   

  
public class Main {
    public static void main(String[] args) throws Exception  { 
    	
    	Scanner sc = new Scanner(System.in); //System.in predefined Stream
    	System.out.println("Enter the String");
    	String a= sc.nextLine();			//reading String
    	System.out.println("Enter the character");
    	char c=sc.next().charAt(0);			//reading char
    	
    	customException(-283);
    	chainedException();
    	
    	//Main m=new Main();
    	charStream();			// used throws keyword
    	byteStream();			//used try catch and finally blocks
    	readWrite();			//reading and writing files && used multiple catch blocks
    	autoclose();			//Automatically closes the file
    	printwriter();			//used printwriter class obj
    	
    	
    }
    
  
    private static void chainedException() {
		int a=0;
		int b=100;
		  try { 
		         int result = b/a;
		         System.out.println("The result is "+result);
		      } catch(ArithmeticException ex) { 
		         System.out.println ("Arithmetic exception occoured: "+ex);
		         try { 
		            throw new NumberFormatException();
		         } catch(NumberFormatException ex1) {
		            System.out.println ("Chained exception thrown manually : "+ex1);
		         }
		      }
		   }
		

	public static void customException(int temp)  
    { 
    	try {
    	if(temp<-273)  
    	      throw new InvalidNumberException("please enter valid temp");  
    	     else  
    	      System.out.println("temp"+temp);  
    	   } 
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
    
    private static void autoclose() throws FileNotFoundException, IOException {
    	System.out.println("inside autoclose");
    	  try (BufferedReader br =
                  new BufferedReader(new FileReader("C:\\Users\\ugesh.basa\\Desktop\\abc.txt"))) {
       System.out.println( br.readLine());
   }
	}

	private static void readWrite() throws IOException {
    	
        String fileName = "C:\\Users\\ugesh.basa\\Desktop\\abc.txt";
        String line = null;
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
                  
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  

        }
        finally {
        	 bufferedReader.close();  
    }
	}

	private static void printwriter() throws Exception  {
     try {
   PrintWriter writer = new PrintWriter(System.out);    
   writer.write("Javatpoint provides tutorials of all technology.");        
   writer.flush();  
   writer.close();  
   //Data to write in File using PrintWriter       
   PrintWriter writer1 =null;      
      writer1 = new PrintWriter(new File("C:\\Users\\ugesh.basa\\Desktop\\abc.txt"));  
      writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");  
      writer1.append("avatpoint provides tutorials of all technology");
                      writer1.flush();  
      writer1.close(); 
     }
     catch(Exception e) {
    	 System.out.println(e);
     }
 }  


	public static void byteStream() throws IOException {		//Byte Streams
		// TODO Auto-generated method stub
    	 FileInputStream in = null;
         FileOutputStream out = null;
         try {
             in = new FileInputStream("C:\\Users\\ugesh.basa\\Desktop\\abc.txt");
             out = new FileOutputStream("C:\\Users\\ugesh.basa\\Desktop\\out.txt");
             int c;

             while ((c = in.read()) != -1) {
                 out.write(c);
             }
         }
         catch(Exception e) {
        	 
        	 System.out.println("inside catch block"); //System.out and err are predefined Streams
        	 System.out.println(e);
         }
         finally {
             if (in != null) {
                 in.close();
             }
             if (out != null) {
                 out.close();
             }
         }
     }
		
	
	public static void charStream() throws IOException{
		// using Character Streams
    	   FileReader inputStream = null;
           FileWriter outputStream = null;           
           try {
               inputStream = new FileReader("C:\\Users\\ugesh.basa\\Desktop\\abc.txt");
               outputStream = new FileWriter("characteroutput.txt");

               int c;
               while ((c = inputStream.read()) != -1) {
                   outputStream.write(c);
                   System.out.println((char)c);
               }
           } finally {
               if (inputStream != null) {
                   inputStream.close();
               }
               if (outputStream != null) {
                   outputStream.close();
               }
           }
    }
}

