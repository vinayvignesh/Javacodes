import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int a = sc.nextInt();
            System.out.println("enter the second number:");
            int b = sc.nextInt();
            int factor = gcd(a,b);
            System.out.println(factor); 
        }   
}
