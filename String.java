import java.io.Serializable;

public class String {

	public static void main(java.lang.String[] args) {
		
		        java.lang.String greeting = "Swati";
		        
		        // Length of the string
		        int length = greeting.length();
		        System.out.println("Length: " + length);
		        
		        // Substring
		        java.lang.String subStr = greeting.substring(0, 5);
		        System.out.println("Substring: " + subStr);
		        
		        // Concatenation
		        java.lang.String newGreeting = greeting.concat(" How are you?");
		        System.out.println("Concatenated String: " + newGreeting);
		        
		        // Replace
		        Serializable replacedStr = greeting.replace('H', 'J');
		        System.out.println("Replaced String: " + replacedStr);
		        
		        // Equality check
		        boolean isEqual = greeting.equals("Hello, World!");
		        System.out.println("Is Equal: " + isEqual);
	
	}

}
