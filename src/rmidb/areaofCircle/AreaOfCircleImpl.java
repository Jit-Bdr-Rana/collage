import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class AreaOfCircleImpl extends UnicastRemoteObject implements AreaOfCircle{
	public static final float pi=22/7;

	AreaOfCircleImpl()throws RemoteException{

	}

	public float getAreaOfCircle(int r)throws RemoteException{
		return (float)(2*pi*r*r);
	}

}