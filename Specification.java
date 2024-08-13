package August;

public class Specification {
	
	    public int getSecondSmallest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array must have at least two elements.");
	        }
	        
	        int firstSmallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < firstSmallest) {
	                secondSmallest = firstSmallest;
	                firstSmallest = arr[i];
	            } else if (arr[i] < secondSmallest && arr[i] != firstSmallest) {
	                secondSmallest = arr[i];
	            }
	        }
	        
	        return secondSmallest;
	    }

	    public static void main(String[] args) {
	        Specification source = new Specification();
	        int[] arr = {23, 45, 32, 22, 20, 96};
	        System.out.println(source.getSecondSmallest(arr)); // Output: 22
	    }
	}


