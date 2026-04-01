import java.util.Scanner;
public class factorial_by_recursion {
    public static void main(String[] args) {

        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        // System.out.println(n);
        if (n==1) {
            return 1;
        }
        return n + factorial(n-1);
    }
   
    
    
}
