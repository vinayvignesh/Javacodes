package Day7codes;

class animal{
    void sound(){
        System.out.println("Animals make sound");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.bark();
        
    }
}
