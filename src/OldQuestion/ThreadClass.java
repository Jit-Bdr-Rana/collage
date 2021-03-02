package OldQuestion;
// using Runnable Interface
//public class ThreadClass implements  Runnable {
//  public void run() {
//	  try { for(int i=0;i<20;i++)
//	  {
//		  System.out.println(i+1);
//		  Thread.sleep(2000);
//	  }
//	 }
//	  catch(InterruptedException e){
//		  System.out.println("Interrupt exception");
//	  }
//	 
//  }
// 
//}
//class Test{
//	public static void main() {
//		ThreadClass t1=new ThreadClass();
//		Thread t2=new Thread(t1);
//		
//		t2.start();
//	}
//}
//using Thread class
public class ThreadClass extends  Thread {
	  public void run() {
		  try { for(int i=0;i<20;i++)
		  {
			  System.out.println(i+1);
			  Thread.sleep(2000);
		  }
		 }
		  catch(InterruptedException e){
			  System.out.println("Interrupt exception");
		  }
		 
	  }
	 
	}
	class Test{
		public static void main() {
			ThreadClass t1=new ThreadClass();
			t1.start();
		}
	}