package interfaces;
//first inheritance
interface book{
	 int x=10;
	void name();
}
//second inheritance
interface  card{
	int z=15;
	void num();
}
//parent class
class ram{
	void show() {
		System.out.println("shoe the data");
	}
}
//sub class
class raj extends ram implements book,card{
	@Override
	public void name() {
		System.out.println("i am siva");
	}
	public void num() {
		System.out.println("num 000");
	}
}
public class Sample {
public static void main(String[] args) {
	raj r = new raj();
	r.show();
	r.num();
	r.name();
}
}
