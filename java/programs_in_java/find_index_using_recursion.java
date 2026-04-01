public class find_index_using_recursion {
 public static void main(String[] args) {
  int[] arr={1,2,3,4,4,4,5,66,4,33,4,53};
  int target =66;
  int i=0;
  System.out.println(recursive(arr,target,i));
  }
  public static int recursive(int[]arr,int target,int i){
   if(i==arr.length){
    return -1;
   }
   if(arr[i]==target){
    return i;
   }
   return recursive(arr,target,i+1);
  }
}
