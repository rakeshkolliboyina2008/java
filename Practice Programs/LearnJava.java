package codejava;

public class LearnJava {
	int rollno;
	  String name; 
	 
	  public LearnJava() {
		  this.rollno = 1234;
		  this.name = "ram";
		  System.out.println("variables are ready");
	  }
	  public LearnJava(String n) {
		  this.rollno = 12345; 
		  this.name = n;
		  System.out.println("variables are ready");
	  }
	  void same() {
		  System.out.println("hello");
		  System.out.println("rollno is:" +this.rollno);
		  System.out.println("name is:" +this.name);
	  }
	  public static void main(String[] args) {
		  LearnJava l=new LearnJava();
		  l.same();
		  LearnJava j=new LearnJava("ramu");
		  j.same();
	  }
}
