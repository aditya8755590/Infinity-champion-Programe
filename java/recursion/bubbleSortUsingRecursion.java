import java.util.Arrays;
public class bubbleSortUsingRecursion {
 public static void main(String[] args) {
  int[] arr={12,324,4,5,5,666,77};
  bubbleSort(arr,arr.length-1,0);
  System.out.println(Arrays.toString(arr));
 }
 public static void  bubbleSort(int[] arr,int n,int i){
  if(n==0){
   return;
  }
if(i<n){
 if(arr[i]>arr[i+1]){
  int temp=arr[i];
  arr[i]=arr[i+1];
  arr[i+1]=temp;
 }
 bubbleSort(arr,n,i+1);
}
else{
 bubbleSort(arr,n-1,0);
}

 }
 
}
