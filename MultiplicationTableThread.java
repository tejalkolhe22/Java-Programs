package aug20;
 
class MultiplicationTable {
synchronized	public void printTable(int n) {
		for(int i=1;i<=10;i++) {
		System.out.println(n+"x"+i+"="+n*i);
		}
	}
}

class Table1 extends Thread{
   MultiplicationTable obj;
   public Table1(MultiplicationTable obj) {
	   this.obj=obj;
   }
   public void run() {
	   obj.printTable(2);
   }
}
class Table2 extends Thread{
	MultiplicationTable obj;
	   public Table2(MultiplicationTable obj) {
		   this.obj=obj;
	   }
	   public void run() {
		   obj.printTable(5);
	   }
}
public class MultiplicationTableThread {

	public static void main(String[] args) throws InterruptedException {
		MultiplicationTable mobj=new MultiplicationTable();
		Table1 t1=new Table1(mobj);
		
		Table2 t2=new Table2(mobj);
		t1.start();
		//t1.join();
		t2.start();

	}

}
