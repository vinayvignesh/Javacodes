import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp>30){
            System.out.println("hot");
        }else if(temp>=20 & temp<=30){
            System.out.println("Warm");
        }else if(temp>=10 & temp<=20){
            System.out.println("Modearte");
        }else{
            System.out.println("cold");
        }
        

        
    }
}
