package inheritance;
class Sample{
	private int a;
	private float b;
	public void setA(int a) {
		this.a=a;
	}
	public int getA() {
		return a;
	}
	public void setB(float b) {
		this.b=b;
	}
	public float getB() {
		return b;
	}
}
public class Encapsulation {
	public static void main(String[]args) {
		 Sample s = new Sample();
		 s.setA(10);
		 System.out.println(s.getA());
		 s.setB(12f);
		 System.out.println(s.getB());
	}
}
