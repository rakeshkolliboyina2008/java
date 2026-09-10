package exceptions;
public class Try {
 public static void main(String[] args) {
	try {
		int result = 10/0;
		System.out.println("Result :" +result);
	}
		catch(ArithmeticException e) {
			System.out.println("error:you can not divide by 0");
			System.out.println("Result :"+e.getMessage());
		}
	}
}

