package Day 5 codes;

public class Recursion1 {
    public static void main(String[] args) {
        int num = 12345;
        int result = sumOfDigits(num);
        System.out.println("sum of digits: "+ num + "is" +result);
        
    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
