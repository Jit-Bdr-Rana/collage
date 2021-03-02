package package1;

public class ThreadDemo {
public static void main(String args[])
 {
   try {
	  System.out.println("statement 1");
	   System.out.println(10/0);
   }
   
   
   catch (NullPointerException e)
   {  
	   e.printStackTrace();
	   System.out.println(e);
	   System.out.println("Statement 2");
	   
   }
   catch(Exception e)
   {
	   System.out.println(10/0);
   }
   
   finally {
	   System.out.println("Finally block is executed successfully you now can do anything here");
   }
 
   
   System.out.println("Statement 3");

}


}


