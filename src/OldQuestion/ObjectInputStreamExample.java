package OldQuestion;
import  java.io.*;
public class ObjectInputStreamExample {
  
	
   public static void main(String []args)throws Exception
   {
	   InputStream in=new FileInputStream(new File("E://file/object.txt"));
	   ObjectInputStream ost=new ObjectInputStream(in);
	   Student s=(Student)ost.readObject();
	   System.out.println(s.name);
	   
	   
   }
}
