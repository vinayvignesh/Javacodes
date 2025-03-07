package Day6codes;

public class Bookconstruct {
    String Title;
    String Author;
    float Price;
    char Money;
    public Bookconstruct(String A, String B, char C,float D){
        Title = A;
        Author = B;
        Money = C;
        Price = D;
    }

    Bookconstruct(Bookconstruct obj){
        Title = obj.Title;
        Author = obj.Author;
        Money = obj.Money;
        Price = obj.Price;
    }
    void show(){
        System.out.println(Title+" "+Author+" "+Price);


    }
    public static void main(String[] args) {
        Bookconstruct obj = new Bookconstruct("Java Programming","James Gosling",'$',30.5f);
        obj.show();
        Bookconstruct obj1 = new Bookconstruct(obj);
        obj1.show();    
    }

}
    

