package A19;
@FunctionalInterface //a interface which has single abstract method
interface MyInt{
   void add();  //no arg no return type
  default void display() {
	  System.out.println("Default Method");
  }
  static void methodstatic() {
	  System.out.println("Static Method");
  }
}
@FunctionalInterface //a interface which has single abstract method
interface MyInt1{
   void add(int i, int j);  //function with parameters no return type
  
}


@FunctionalInterface //a interface which has single abstract method
interface MyInt2{
   int add(int i, int j);  //function with parameters no return type
 }
@FunctionalInterface //a interface which has single abstract method
interface Tejal{
	void add(int i,int j);
	default void display() {
		 System.out.println("Default Method");
	}
	static void methodstat() {
		System.out.println("Static Method");
	}
}
@FunctionalInterface
interface Subtract{
    void sub();
}
/*@FunctionalInterface
interface Subtract1{
    void sub(int i, int j);
}
@FunctionalInterface
interface Subtract2{
   int sub(int i,int j);
}*/
@FunctionalInterface
interface Multiply{
    void mult();
}
public class LambdaExpression {

	
		 public static void main(String[] args) {
//	        Product pob=new Product();
//	        pob.add();
	        
	        //using annanymous class
	        
	        MyInt mob=()-> {
	                System.out.println("Add method");
	                
	            };
	      mob.add();
	      mob.display();
	      MyInt.methodstatic();
	      MyInt1 mob1=(i, j)->{
			  int s;
			  s=i+j;
			  System.out.println("Lambda expression with arg no return type");
			  System.out.println("sum="+s);
		  };
		  
		  MyInt1 mob2=(i, j)->System.out.println("sum ="+(i+j));
			  mob2.add(5,9);
			  
		  	  mob1.add(7, 3);
		  	  
		  	  //function with arg and with return type
		  	  
		  	  MyInt2 mob3=(i,j)->{
				return (i+j);
		  		  
		  	  };
		  	  
		  	  System.out.println("sum of 2 numbers="+mob3.add(6, 13));
	     
	      
	    		  
	        Subtract sob=() -> {
	            System.out.println("Subtract method");
	        };
	      
				  sob.sub();
				  /*Subtract1 sob1=(i, j)->{
					  int s;
					  s=i-j;
					  System.out.println("Lambda expression with arg no return type");
					  System.out.println("sub="+s);
				  };*/
				  
				 /* subtract2 sob2=(i, j)->System.out.println("sub ="+(i-j));
					  sob3.sub(7,3);
					  sob2.sub(9,6);
					  MyInt2 sob3=(i,j)->{
							return (i-j);
					  };
					  System.out.println("sub of 2 numbers="+sob3.sub(6, 13));
					     
				      */
	        Multiply multob=()->{
	            System.out.println("multiplication ");
	        };
	        multob.mult();
	        Tejal tb=(i,j)->{
	        
	        	 System.out.println("Addition of 2 numbers="+(i+j));	   
	        };
	        tb.add(5,9);
	        tb.display();
	       Tejal.methodstat();
	        }
		 
	}
	





