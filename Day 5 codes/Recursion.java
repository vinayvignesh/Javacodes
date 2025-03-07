public class Recursion {
    
    // Correctly define the factorial function outside main()
    static int fact(int n) {
        if (n == 0) { // Base case: 0! = 1
            return 1;
        }
        return n * fact(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(fact(5)); // Correct placement inside main()
    }
}

