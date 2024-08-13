package August;

public class ArrayIndexEH {

	public static void main(String[] args) {
		int a[]= {7,9,5,3};
		System.out.println("Before array element access");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		try {
		System.out.println(a[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		}
		System.out.println("After array element access");
	}

}
