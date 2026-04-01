import java.util.*;
public class merz_sort {
 public static void main(String[] args) {
  int [] arr={1,2,3,4,3,32,44,5,4,232,44};
  int i=0,j=arr.length-1;
  int[] arr1=divide(arr,i,j);
  System.out.println(Arrays.toString(arr1));
 }
 static int[] divide(int[] arr,int i,int j){
  if(i==j){
    return new int[]{arr[i]};
}
  int mid=i+(j-i)/2;
  int[] a=divide(arr,i,mid);
  int[] b=divide(arr,mid+1,j);
  return merz(a,b);
 }

 static int[] merz(int[] arr1,int[] arr2){
  int n=arr1.length,m=arr2.length;
  int[] res=new int[n+m];
  int i=0,j=0,c=0;
  while(i<n&&j<m){
   if(arr1[i]<=arr2[j]){
    res[c]=arr1[i];
    i++;
   }
   else{
   res[c]=arr2[j];
     j++;
   }
   c++;
  }
  while(i<n){
   res[c]=arr1[i];
   i++;
   c++;
  }
  while(j<m){
   res[c]=arr2[j];
   j++;c++;
  }
  return res;
 }
 
}
