 import java.util.Arrays;
 public class Solution {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr={1,2,1};
        Solution s=new Solution();
        int[] ans=s.divide(arr,0,arr.length-1);
        System.out.print(Arrays.toString(ans));
        System.out.println("\nCount of inversions: " + count);
    }
     public int[] divide(int[] arr,int i,int j){

         if (i == j) {
        return new int[]{arr[i]};
    }
        int mid = i + (j - i) / 2;
        int[] arr1=divide(arr,i,mid);
        int[] arr2=divide(arr,mid+1,j);
        int[] ans=merze(arr1,arr2);
        return ans;
     }
    public int[] merze(int[] a,int[] b){
        int i=0,j=0,ind=0;
        int n=a.length,m=b.length;
        int[] ans=new int[m+n];
        while(i<n&&j<m){
            if(a[i]<b[j]){
                ans[ind]=a[i];
                i++;
                count++;
            }
            else{
                ans[ind]=b[j];
                j++;
            }
            ind++;
        }
        while(i<n){
            ans[ind]=a[i];
                i++;
                ind++;
        }
        while(j<m){
             ans[ind]=b[j];
                j++;
                ind++;
        }
        return ans;
        
    }
}