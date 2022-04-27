import java.rmi.*;
import java.rmi.server.*;

public class AdditionInterfaceImpl extends UnicastRemoteObject implements AdditionInterface {
	public AdditionInterfaceImpl()throws RemoteException {

	}
	public int sum(int a,int b) throws Exception{
		return a+b;
	}
}