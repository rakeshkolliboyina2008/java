package codejava;

class Gem {
	int x=5,y=6;
	void add() {
		System.out.println("add is :" +(x+y));
	}
}
public class MyProgs {
	public static void main(String[] args) {
    int x=10,y=20;
    int z=x+y;
    System.out.println("result to :" +z);
    Gem g= new Gem();
    g.add();
	}
}
