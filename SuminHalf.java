import java.util.Scanner;

public class SuminHalf {
	
	      
	public static void main(String[] args) {
        double sum = 1;
       int n=10;
        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += (float)1 / i;
        }

        // Print the result
        System.out.println("The sum of the series is: " + sum);
    }
}
	  


