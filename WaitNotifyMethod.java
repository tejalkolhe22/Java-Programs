package aug20;
class Bank{
	private double amount;
	public Bank(){
		amount=1000;
	}
	synchronized void deposit(double damount) {
		System.out.println("Inside deposit Method");
		amount=amount+damount;
		System.out.println("After deposit your amount="+amount);
		notify();
	}
	synchronized void withdrwa(double wamount) throws InterruptedException {
		System.out.println("Inside withdraw Method");
		if(amount<wamount){
			System.out.println("Insufficient balance");
		
		wait();
		System.out.println("After wait");
		}
		amount =amount-wamount;
		System.out.println("Balance amount after withdraw="+amount);
	}
}
public class WaitNotifyMethod {

	public static void main(String[] args) {
		Bank bobj=new Bank();
		Thread t1=new Thread() {
             public void run() {
            	 try {
            		 bobj.withdrwa(4000);
            	 }catch(InterruptedException e) {
            		 e.printStackTrace();
            	 }
             }
	};
    t1.start();
    Thread t2=new Thread() {
    	public void run() {
    		bobj.deposit(5000);
    	}
    };
    t2.start();
}
}