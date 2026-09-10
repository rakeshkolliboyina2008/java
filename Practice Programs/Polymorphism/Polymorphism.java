package inheritance;
class On{
	int  x=27;
	 void sum() {
		 System.out.println("sum :"+(x+100));	
	 }
 }
//class To extends On {
//	 int x= 34;
//	 void see () {
//		 System.out.println("see :"+super.x);
//		 }
//}
class To extends On {
	@Override
	void sum() {
		 System.out.println("sum :"+(x+10));	
	}
}
class Thre extends One{
	 	 void sum(int z) {
		 System.out.println("sum :"+(x+z));	
	 }
}

public class Polymorphism {
	public static void main(String[]args) {
//		To t= new To();
//		 t.see();
//          t.sum();
		Thre t=new Thre();
		t.sum(12);
	}
}
