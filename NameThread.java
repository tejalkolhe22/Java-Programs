package aug20;
class MulitiplicationTable{
synchronized public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}
class Table3 extends Thread{
	MultiplicationTable obj;
	   public Table3(MultiplicationTable obj) {
		   this.obj=obj;
	   }
		   public void run() {
			   obj.printTable(5);
		   }
}
class Table4 extends Thread{
	MultiplicationTable obj;
	   public Table4(MultiplicationTable obj) {
		   this.obj=obj;
}
	   public void run() {
		   obj.printTable(5);
	   }
}

public class NameThread {

	public static void main(String[] args) {
		MultiplicationTable mobj=new MultiplicationTable();
		Table3 t3=new Table3(mobj);
		
		Table4 t4=new Table4(mobj);
		 t3.start();
         t4.start();
	}

}
