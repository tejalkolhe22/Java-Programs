package August;

import java.util.Scanner;

public class DistanceCalculstor {

	public static void main(String[] args) {
		
	        // Initial velocity in km/hr
	        double initialVelocityKmHr = 36;
	        // Convert initial velocity to m/s
	        double initialVelocityMS = (initialVelocityKmHr * 1000) / 3600;
	
	        double acceleration = 5;

	        Scanner scanner = new Scanner(System.in);

	        // Read the two-time intervals from the input
	        int t1 = scanner.nextInt();
	        int t2 = scanner.nextInt();

	        // Calculate distance for the first time interval
	        double distance1 = initialVelocityMS * t1 + (acceleration * t1 * t1) / 2;
	        // Calculate distance for the second time interval
	        double distance2 = initialVelocityMS * t2 + (acceleration * t2 * t2) / 2;

	        // Print the results
	        System.out.println((int) distance1);
	        System.out.println((int) distance2);

	      
	    }
	
	}


