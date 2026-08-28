interface I1{
    void show1();
}
class C1 implements I1{
    public void show1(){
        System.out.println("I1 method");
    }
}
public class Main{
    public static void main(String args[]){
        C1 obj = new C1();
        obj.show1();
    }
}
