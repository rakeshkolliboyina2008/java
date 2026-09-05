package exception;
public class Two {
	public static void main(String[] args) {
	try {
		//index start from 0 
		//max index of array a is 2 
	    int[] a = {10, 20, 30};
	    System.out.println(a[5]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("Invalid array index");
	}
 
  }
}
