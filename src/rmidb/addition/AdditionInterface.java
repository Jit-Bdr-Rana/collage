import java.rmi.server.*;
import java.rmi.*;


public interface AdditionInterface extends Remote{

	public int sum(int a,int b) throws Exception;
}