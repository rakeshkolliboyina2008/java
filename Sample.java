package codejava;

	class Example{
		int add(int a,int b) {
			return(a+b+50);
		}
	}
	public class Sample {
			int sum(int x,int y,int z) {
			return(x+y+z+100);
		 }
		public static void main (String[] args) {
	    Sample s=new Sample();
		int res=s.sum(30, 40, 50);
		System.out.println("result is:" +res);
		
		Example e=new Example();
		int req = e.add(10,20);
		System.out.println("result is:" +req);
		}
}
