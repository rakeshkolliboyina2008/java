package so;
public class Compare {
	public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana";
       //First string comes before second then it gives -1
       //by comparing the characters strings
       System.out.println(s1.compareTo(s2));
       //First string comes after second then it gives the 1
       System.out.println(s2.compareTo(s1));
       // if Strings are equal then it gives the value 0
       System.out.println(s1.compareTo("Apple"));
    }
}
