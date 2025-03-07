
import java.util.Scanner;

public class ATMpinEx {
     public static void main(String[] args) {
         int pin=6564;
         int attempts = 3;
         Scanner sc = new Scanner(System.in);
         while(attempts>0){
            System.out.println("ente your pin: ");
            int enteredpin = sc.nextInt();
            if (enteredpin==pin){
                System.out.println("PIN IS CORRECT");
                break;
            }else{
                attempts--;
                System.out.println("PIN IS INCORRECT");
            }if(attempts==0){
                System.out.println("Attempts are over");
            }
         }
     }
    
}
