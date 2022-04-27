import java.rmi.*;
import java.rmi.server.*;

public class Client {

	public static void main(String[] args)throws Exception {
		 
		 AdditionInterface additionInteface=(AdditionInterface)Naming.lookup("rmi://localhost:5000/rmi");

		 System.out.println("The sum of two number is ="+additionInteface.sum(12,15));


	}
}