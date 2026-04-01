import java.util.*;
public class max_sum_of_sub_array {
    public static void main(String[] args) {
        int[] array={-1,-3,-5,-6,-7,-1,555,8888888};
        //# bootforce matlab ki zo sabse saral ho saktha hai 
    //     int[] array2={2,3,-8,7,-1,2,3};
    //     int  max_sum=Integer.MIN_VALUE;
 
    //      for(int i=0;i<array.length;i++){
    //          for(int j=i;j<array2.length;j++){
    //              int sum=0;
    //              for(int k=i;k<=j;k++){
    //                  sum+=array2[k];
    //              }
    //              max_sum=Math.max(sum,max_sum);
    //          }
    //      }
    //      System.out.println(max_sum);
    //  }
// 2 loop se 
        // int max_sum=Integer.MIN_VALUE;
        // for(int i=0;i<array.length;i++){
        //     int current_sum=0;
        //   for(int j=i;j<array.length;j++){
        //     current_sum+=array[j];
        //     max_sum=Math.max(current_sum,max_sum);
        //     }
        // }
        // System.out.println(max_sum);


        //#kadans Algorithm
        // ab is mai hum jis kisi array ka sum negative aa raha hai us ko hata denge


        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            current_sum+=array[i];
            max_sum=Math.max(current_sum,max_sum);
            if(current_sum<0){
                current_sum=0;

            }


        }
        System.out.println(max_sum);
    }
    
}
