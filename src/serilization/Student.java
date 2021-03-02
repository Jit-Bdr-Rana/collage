package serilization;
import java.io.*;
public class Student implements Serializable  {
public int id;
String name;
public Student(int id,String name) {
	this.id=id;
	this.name=name;
	}
}
