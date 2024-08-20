package aug20;
class Product extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(""+Thread.currentThread()+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadMainApp {

	public static void main(String[] args) throws InterruptedException {
		Product pobj1 = new Product();
		Product pobj2 = new Product();
		pobj1.setName("First");
		pobj2.setName("Second");
		System.out.println("Thread state "+pobj1.isAlive());
		pobj1.start();
		System.out.println("Thread state "+pobj1.isAlive());
		
		pobj1.join();
		System.out.println("Thread state pobj1 "+pobj1.isAlive());
		System.out.println("Thread state pobj2"+pobj2.isAlive());
		pobj2.start();
		System.out.println("Thread state pobj2"+pobj2.isAlive());
		

	}

}
