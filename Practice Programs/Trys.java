package exceptions;
public class Trys {
public static void main(String[] args) {
		try {
		String input = "0";
		int length = input.length();
		int number = Integer.parseInt(input);
		int result = 10/number;
	}catch(NullPointerException e) {
		System.out.println("input is completely empty");
		}catch(NumberFormatException e){
		System.out.println("cannot convert the text with letters into number");
	}catch(ArithmeticException e) {
		System.out.println("Result :"+e.getMessage());
}
}
}