import java.rmi.*;
import java.rmi.server.*;

public class Server {
	public static void main(String[] args)throws Exception{
		
		AreaOfCircle areaofCircle=new AreaOfCircleImpl();
		Naming.rebind("rmi://localhost:5000/rmi",areaofCircle);
        System.out.println("Server is running.......................");
	}
}