package exception;
public class Three {
public static void main(String[] args) {
	try {
		//abc is not a number
	    String s = "abc";
	    int num = Integer.parseInt(s);
	}
	catch (NumberFormatException e) {
	    System.out.println("invalid number");
	}
}
}
