package Day6codes;

public class Studentconstruct {
    String name;
    long rollnumber;
    char Grade;
    public Studentconstruct(String A, int B, char C){
        name = A ;
        rollnumber = B;
        Grade = C;

    }
    void show(){
        System.out.println(name+" "+rollnumber+" "+Grade);

    }
    public static void main(String[] args){
        Studentconstruct obj = new Studentconstruct("Vinay",321206,'E');
        obj.show();
    }
}