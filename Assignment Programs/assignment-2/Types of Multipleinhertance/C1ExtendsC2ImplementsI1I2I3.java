// Parent class
class C2
{
    // Method of C2 class
    void show2()
    {
        System.out.println("C2 method");
    }
}

// First interface
interface I1
{
    // Abstract method of I1
    void show1();
}

// Second interface
interface I2
{
    // Abstract method of I2
    void showI2();
}

// Third interface
interface I3
{
    // Abstract method of I3
    void showI3();
}

// C1 inherits C2
// and implements three interfaces: I1, I2 and I3
class C1 extends C2 implements I1, I2, I3
{
    // Implementing show1() method of I1
    public void show1()
    {
        System.out.println("I1 method");
    }

    // Implementing showI2() method of I2
    public void showI2()
    {
        System.out.println("I2 method");
    }

    // Implementing showI3() method of I3
    public void showI3()
    {
        System.out.println("I3 method");
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

        // Calling showI2() implemented from I2
        obj.showI2();

        // Calling showI3() implemented from I3
        obj.showI3();
    }
}
