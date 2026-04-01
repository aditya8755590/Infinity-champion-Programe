public class binary_search {
 public static void main(String[] args) {
  int[] arr={1,2,4,55,66,77,88,99};
  int i=0;
  int j=arr.length-1;
  int t=88;
 System.out.println(binary(i,j,arr,t));
 }
 public static int binary(int i,int j,int[] arr,int t){
     int mid =i+(j-i)/2;
     if(i>j){
      return -1;
     }
     if(arr[mid]==t){
      return mid;
     }
     if(arr[mid]>t){
      return binary(i,mid-1,arr,t);
     }
      return binary(mid+1,j,arr,t);
 }
 
}
