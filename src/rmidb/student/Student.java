
public class Student {
 private int id;
 private String name;
 private String roll;
 private String age;
   Student(int id ,String name,String roll,String age){
	   this.id=id;
	   this.name=name;
	   this.roll=roll;
	   this.age=age;
	   
   }

   public int getId(){
   	return id;
   }
   public String getName()
   {
   	return name;
   }
   public String getRoll(){
   	return roll;
   }
   public String getAge(){
   	return age;
   }
   
 }
