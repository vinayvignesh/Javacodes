package Day7codes;

interface Student{
    int num = 80;
    void speak();
}
class Trainer implements Student{

    public void speak(){
        System.out.println("Training is going on");
    }

}
public class InterfaceEx {
    public static void main(String[] args) {
        Trainer t = new Trainer();
        t.speak();
    }
    
}
