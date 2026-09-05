package exception;
public class One {
	    public static void main(String[] args) {
	    	try {
	    		//null is not a string
	    	    String name = null;
	    	    System.out.println(name.length());
	    	}
	    	catch (NullPointerException e) {
	    	    System.out.println("Object is null");
	    	}
		}
	   }
