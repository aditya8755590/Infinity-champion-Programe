import java.util.*;
public class sliding_window {
    public static void main(String[] args) {
        // to find k length subarray and find the max sum of those sub array
        int[] array={909,2,3,4,4,4,2,2,4,5,5,606,};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int sum=0;
        int max=Integer.MIN_VALUE;
        // bootforce method
    //     for(int i=0;i<array.length-1;i++){
    //         sum=0;
    //         for(int j=0;j<k;j++){
    //             sum=sum+array[j+i];
    //             System.out.print(array[j+i]+",");
    //         }
    //         System.out.println();
    //         max=Math.max(max, sum);
    //     }



    //     System.out.println(max);
    // 
//sliding window
for(int i=0;i<k;i++){
    //window
    sum+=array[i];
}
max=Math.max(max, sum);
for(int i=k;i<array.length;i++){
    sum+=array[i];//window grow
    sum-=array[i-k];//window shrink
    max=Math.max(max, sum);
}
System.out.println(max);




    }
    
}
