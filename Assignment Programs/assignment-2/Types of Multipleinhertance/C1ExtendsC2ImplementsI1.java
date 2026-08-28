// Parent class
class C2
{
    // Method of C2 class
    void show2()
    {
        System.out.println("C2 method");
    }
}

// Interface
interface I1
{
    // Abstract method of I1
    void show1();
}

// C1 inherits C2 and implements I1
class C1 extends C2 implements I1
{
    // Implementing show1() method of I1
    public void show1()
    {
        System.out.println("I1 method");
    }

    // Main method
    public static void main(String args[])
    {
        // Creating an object of C1 class
        C1 obj = new C1();

        // Calling show2() inherited from C2
        obj.show2();

        // Calling show1() implemented from I1
        obj.show1();
    }
}
