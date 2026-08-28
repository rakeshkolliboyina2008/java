package inheritance;
interface riya{
	 int x=10;
	void siva();
}
interface raji extends riya {
	int z=15;
	void lucky();
}
class Raghu implements riya, raji{
	@Override
	 public void siva() {
		System.out.println("i am siva");
	}
	@Override
	public void lucky() {
		System.out.println("i am lucky");
	}
}
public class Inter {
	public static void main(String[] args) {
		Raghu r=new Raghu();
		r.siva();
		r.lucky();
	}

}
