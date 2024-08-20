package A19;
class Employee{
    
}
class MyClass1 implements Runnable{
    @Override
    public void run() {
         System.out.println("Inside run method "+Thread.currentThread());
        
    }
    
}
public class MainAppRenunnable {

	public static void main(String[] args) {
		 MyClass1 obj1=new MyClass1();
	        Thread tobj1 = new Thread(obj1);
	        tobj1.start();
	        
	        MyClass1 obj2=new MyClass1();
	        Thread tobj2 = new Thread(obj2);
	        tobj2.start();
	}

}
