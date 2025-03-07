class Fauna{
    void eat() {
        System.out.println("Animals eat food");
    }
}

class Mammal extends Fauna {
    void walk() {
        System.out.println("Mammals walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Animal{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Method from Animal class
        myDog.bark(); // Method from Dog class
        myDog.walk(); // Method from Mammal class
    }
}