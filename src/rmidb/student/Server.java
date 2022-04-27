import java.rmi.*;
import java.rmi.server.*;
public class Server {

public static void main(String[] args)throws Exception {
	Remote r= new StudentInterfaceImpl();
	Naming.rebind("rmi://localhost:6666/jit",r);
	System.out.println("Server starting ");
}
}