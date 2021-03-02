package serilization;
import java.io.*;
public class Deseralize {
  public static void main(String args[]) throws Exception{
	  
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E://file/serialize.txt"));
	  Student s=(Student)in.readObject();
	  System.out.println(s.id+" "+s.name);  
  	  in.close();  
	  
	  
	 
  }
 
}
