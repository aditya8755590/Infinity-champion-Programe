public class sort_two_sorted_arr {
 public static void main(String[] args) {
  int [] arr1={1,2,2,2,2,4,444,700,900,950,1000};
  int [] arr2={9,10,11,10002,100003};
  int ans[]=merz(arr2, arr1);
  int m=arr1.length,n=arr2.length;

  for(int i=0;i<m+n;i++){
System.out.print(ans[i]+",");
  }
  
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
   else if(j<m){
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
