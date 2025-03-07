package Day6codes;
public class Constructexmp{
    String name;
    int num;
    public Constructexmp(String c, int d){
        name = c;
        num = d;
    }
    void show(){
        System.out.println(name+" "+num);
    
    }
    public static void main(String[] args){
        Constructexmp obj = new Constructexmp("Vinay", 21);
        obj.show();
    }
}