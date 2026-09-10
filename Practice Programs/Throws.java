package exceptions;
public class Throws {
	public static void votingeligibility(int age) throws IllegalArgumentException{
		if(age<0) {
		   throw new IllegalArgumentException("Age cannot be negative."); 
		}
		if (age >= 18) {
            System.out.println("Access Granted: You are eligible to vote.");
        } else {
            System.out.println("Access Denied: You must be 18 or older.");
        }
	}
public static void main(String[] args) {
	try {
        System.out.println("Testing with age -5:");
        votingeligibility(-5); // ⚠️ This will trigger the exception
        
    } catch (IllegalArgumentException e) {
        // 3. The error thrown by the method lands right here
        System.out.println("Caught an error in main: " + e.getMessage());
    }
}
}
