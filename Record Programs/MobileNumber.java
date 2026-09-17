package Excersice;
 
import java.util.Scanner;
 
// User-defined checked exception
class LengthNotSufficientException extends Exception {
    LengthNotSufficientException(String message) {
        super(message);
    }
}
 
public class MobileNumber {
 
    // Validates the number and throws the appropriate exception
    static void validate(String number)
            throws LengthNotSufficientException {
 
        // Rule 1: every character must be a digit (0-9)
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                throw new NumberFormatException(
                        "Invalid Mobile Number - NumberFormatException");
            }
        }
 
        // Rule 2: length greater than 10
        if (number.length() > 10) {
            throw new ArrayIndexOutOfBoundsException(
                    "Invalid Mobile Number - ArrayIndexOutofBounds Exception");
        }
 
        // Rule 3: length less than 10
        if (number.length() < 10) {
            throw new LengthNotSufficientException(
                    "Invalid Mobile Number - LengthNotSufficientException");
        }
 
        System.out.println("Valid number");
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Number: ");
        String number = sc.nextLine().trim();
 
        try {
            validate(number);
        }
        catch (NumberFormatException e) {           // non-digit character
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {  // more than 10 digits
            System.out.println(e.getMessage());
        }
        catch (LengthNotSufficientException e) {    // fewer than 10 digits
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
} 