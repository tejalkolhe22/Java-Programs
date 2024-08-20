package A19;
class Myclass extends Thread{
	public void run() {
		System.out.println("Run method Called"+Thread.currentThread());
	}
}
public class Multithreading {

	public static void main(String[] args) {
		System.out.println("Main Thread" +Thread.currentThread());
       Myclass obj=new Myclass();
      obj.start();//thread-0
      obj.setName("first thread");
      
      Myclass obj1=new Myclass();
     
      obj.setName("second thread");
      obj1.start();//thread--1
     /* Myclass obj2=new Myclass();
      obj2.start();
      Myclass obj3=new Myclass();
      obj3.start();
      Myclass obj4=new Myclass();
      obj4.start();
      Myclass obj5=new Myclass();
      obj5.start();*/
      
      //obj.start();//can be started only ones
       //obj.run();
	}

}
