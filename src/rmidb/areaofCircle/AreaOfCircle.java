import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public interface AreaOfCircle extends Remote{

	public float getAreaOfCircle(int r) throws RemoteException;
}