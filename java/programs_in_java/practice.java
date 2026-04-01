import java.util.*;
public class practice {
    public static void main(String[] args) {
        int[] array={2,3,-8,7,-1,2,3};
       int  max_sum=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=array[k];
                }
                max_sum=Math.max(sum,max_sum);
            }
        }
        System.out.println(max_sum);
    }
    
}
