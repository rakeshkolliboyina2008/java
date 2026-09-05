package exception;
public class Four {
public static void main(String[] args) {
	try {
		//string index is 4 for java
		String name = "Java";
        System.out.println(name.charAt(10));
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
	}
}
}
