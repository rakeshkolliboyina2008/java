package inheritance;
//class Sir{
interface Sir{       //	 we are using the abstraction concept
	int x =12;
	 default void sub() {
		System.out.println("sub :"+(x-2));
	}
}
//class Stu{
interface Stu{       //	 we are using the abstraction concept
	int y=15;
	default void sum() {
		System.out.println("sum :"+(y+10));
	}
}
//class Stud extends Sir  Stu{
class Stud implements Sir, Stu{       //	we are using the abstraction concept
    void mul() {
	System.out.println("mul :"+(y*x));
}
}
public class Multiple {
	public static void main(String[]args) {
		Stud st=new Stud();
		st.mul();
	}	
}
