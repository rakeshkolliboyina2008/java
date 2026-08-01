package inheritance;
class Exp{
//	int x=10;
//	void shoe() {
//		System.out.println("this is exp");	
//	}
	String name;
	int roll;
	float percentage;
	Exp(String n,int m,float l){
		this.name = n;
		this. roll = m;
		this. percentage = l;
	}
}
class Ext extends Exp{
	Ext(String n,int m,float l){
	super(n,m,l);
	}
	void see () {
//	System.out.println("see :"+super.x);
		System.out.println("name :"+name); 
		System.out.println("roll :"+roll);
		System.out.println("percentage :"+percentage);
}
}
public class Super {
	public static void main(String[]args) {
	//	Ext ext = new Ext();
	Ext ext = new Ext("raki",222,90f);
	ext.see();
 }
}
