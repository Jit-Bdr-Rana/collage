import java.rmi.*;
import java.rmi.server.*;

public class Server {
	public static void main(String[] args) throws Exception{
		
		AdditionInterface additionInterface=new AdditionInterfaceImpl();
		Naming.rebind("rmi://localhost:5000",additionInterface);
		System.out.println("Srver has been start .........");

	}
}