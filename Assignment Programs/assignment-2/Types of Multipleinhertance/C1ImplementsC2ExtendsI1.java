package interfaces;
class C2{
    void show2(){
        System.out.println("C2 method");
    }
}
interface I1{
    void show1();
}
// Invalid statement
class C1 implements C2 extends I1{
    public void show1(){
        System.out.println("I1 method");
    }
}
public class Main{
    public static void main(String args[]){
        C1 obj = new C1();
        obj.show2();
        obj.show1();
    }
}
