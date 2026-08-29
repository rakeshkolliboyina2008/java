package interfaces;
//first inheritance
interface riya{
	 int x=10;
	void siva();
}
//second inheritance
interface raji extends riya {
	int z=15;
	void lucky();
}
//inheritance
class Raghu implements raji{
	@Override
	 public void siva() {
		System.out.println("i am siva");
	}
	@Override
	public void lucky() {
		System.out.println("i am lucky");
	}
}
public class Simple {
public static void main(String[] args) {
	Raghu r=new Raghu();
	r.siva();
	r.lucky();
}
}
