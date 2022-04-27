import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class Client{

	public static void main(String[] args) throws Exception{
		
		AreaOfCircle areaofCircle=(AreaOfCircle)Naming.lookup("rmi://localhost:5000/rmi");
		Scanner sc=new Scanner(System.in);
		while(true){
		int r=sc.nextInt();

		System.out.println(areaofCircle.getAreaOfCircle(r));
	  }
	}
}