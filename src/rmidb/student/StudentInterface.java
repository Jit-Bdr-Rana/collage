import java.rmi.*;
import java.util.*;
public interface StudentInterface extends Remote{

	public List<Student> getStudent()throws Exception;

}