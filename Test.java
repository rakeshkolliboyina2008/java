package codejava;

public class Test {
	void sample(int w) {
		int u= 10, v = 20;
		System.out.println("Add of u and v is: " + (u+v+w));
	}
	
	int calc(int w) {
		int u= 10, v = 20;
//		System.out.println("Add of u and v is: " + (u+v+w));
		return u+v+w;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.sample(30);
		System.out.println("Reslut is: " + t.calc(9));
	}
}
