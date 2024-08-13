package August;

public class Sort {

	 public char maxOccuringChar(String str) {
	        int[] freq = new int[256]; // Array to store the frequency of each character
	        int maxFreq = 0; // Variable to keep track of the maximum frequency
	        char maxChar = str.charAt(0); // Variable to store the character with the maximum frequency

	        // Calculate the frequency of each character
	        for (int i = 0; i < str.length(); i++) {
	            freq[str.charAt(i)]++;
	        }

	        // Find the character with the maximum frequency
	        for (int i = 0; i < str.length(); i++) {
	            if (freq[str.charAt(i)] > maxFreq) {
	                maxFreq = freq[str.charAt(i)];
	                maxChar = str.charAt(i);
	            }
	        }

	        return maxChar;
	    }
	    
	    public static void main(String[] args) {
	        Sort sort = new Sort();
	        String input = "DoSelect";
	        char result = sort.maxOccuringChar(input);
	        System.out.println(result);  // Expected output: 'e'
	    }
	
		

	}


