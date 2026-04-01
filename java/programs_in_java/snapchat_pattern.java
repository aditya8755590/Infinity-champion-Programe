

import java.util.*;
public class snapchat_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 0 ;i<a;i++){
            int ncr=1;
            for (int j=0;j<=i;j++){
                System.out.print(ncr+" ");
                int numinator=i-j;
                int deniominator=j+1;
                ncr=(ncr*(numinator))/deniominator;
              
            }
          System.out.println();
        }
    }
}