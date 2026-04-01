import java.util.*;

    
//
//          1 
//        2 3 2 
//      3 4 5 4 3 
//    4 5 6 7 6 5 4 
//  5 6 7 8 9 8 7 6 5 
public class ComplexPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");  // Two spaces for proper alignment
            }
            
            // Print increasing part of the pattern
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j + " ");
            }
            
            // Print decreasing part of the pattern
            for (int j = (2 * i) - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();  // Move to next line after each row
        }
    }
}