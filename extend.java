package inheritance;
 class One{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
 }
 class Two extends One {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
 }
// class Three extends Two{
//	 int z=12;
//	 void demo() {
//		 System.out.println("see :"+super.x+ " "+super.y+ " "+this.z);
//	 }
// }
 class Three extends One{
	 int z=12;
	 void demo(){
		 System.out.println("see :"+super.x+ " "+this.z);
	 }
 }
public class extend {
	public static void main(String[]args) {
		Three t=new Three();
		t.demo();
//		 Two t= new Two();
//		 t.see();
	}
}
