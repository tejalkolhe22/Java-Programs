package August;

public class MainApp {

	public static void main(String[] args) {
		int a=12,b=0,c=0;
		
		System.out.println("Before division");
		try {
		 c=a/b;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
           System.out.println("After Division "+c);

	}

}
