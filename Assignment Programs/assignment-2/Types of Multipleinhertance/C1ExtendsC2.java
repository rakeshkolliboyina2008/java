// Parent class
class Animal
{
    // Method of parent class
    void eat()
    {
        System.out.println("Animal eats");
    }
}

// Child class extends Parent class
class Dog extends Animal
{
    // Method of child class
    void bark()
    {
        System.out.println("Dog barks");
    }
}

// Main class
class InheritanceDemo
{
    public static void main(String args[])
    {
        // Creating object of Dog class
        Dog d = new Dog();

        // Calling inherited method from Animal
        d.eat();

        // Calling Dog's own method
        d.bark();
    }
}
