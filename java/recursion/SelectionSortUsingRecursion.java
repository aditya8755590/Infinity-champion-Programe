import java.util.Arrays;
public class SelectionSortUsingRecursion {
 public static void main(String[] args) {
  int[] arr={12,324,4,5,5,5,5,5,666,77};
  SelectionSort(arr,arr.length-1,0,0);
  System.out.println(Arrays.toString(arr));
 }
 public static void SelectionSort(int[] arr,int n,int i,int key){
  if(n==0){
   return ;
  }
  if(n>=i){
   if(arr[i]>arr[key]){
    key=i;}
    SelectionSort(arr,n,i+1,key);
  }
  else{
   int temp=arr[n];
   arr[n]=arr[key];
   arr[key]=temp;
  SelectionSort(arr,n-1,0,0);

  }
 }
 
}
