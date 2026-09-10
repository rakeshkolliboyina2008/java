package codejava;
	class simple{
		void sample() {
			int x=100,y=100;
			System.out.println(" add of :"+(x+y));
		}
	}
	class para  {
		void add() {
			int x = 10,y=20;
			 System.out.println("add of:" +(x+y));
	}
	}
	public class Pros{
	  public static void main(String[] args) {
		 simple s= new simple();
		 s.sample();
		 para p= new para();
		 p.add();
		 System.out.println("add of:" + p);
	  }
	}

	  


