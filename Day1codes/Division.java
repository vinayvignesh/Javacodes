import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("not divisible by 3");
            
        }
    }

    
}
