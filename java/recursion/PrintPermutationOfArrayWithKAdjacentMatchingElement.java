import java.util.Scanner;
class PrintPermutationOfArrayWithKAdjacentMatchingElement {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array:");    
         int n = sc.nextInt();
      System.out.println("Enter the range of the Elements:");    
         int m=sc.nextInt();
      System.out.println("Enter the number of adjacent matching elements:");
         int k=sc.nextInt();
         int ans=permutation(n,m,k);
         System.out.println("Your ans is"+ans);
   }
  public static int permutation(int n,int m,int k){
   int[] range= new int[m];
   for(int i=0;i<m;i++){
         range[i]=i+1;
}
   int[] arr = new int[n];
    return doWork(arr, range, n, k,0,0);
}
   public static int doWork(int[] arr, int[] range, int n, int k,int pos,int count) {
      if(pos==n){
         if(k==count){
         return 1;}
      return 0;
      }
      int s=0;
         for(int ele:range){
            arr[pos]=ele;
            int newCount=count;
            if(pos!=0&&arr[pos]==arr[pos-1]){
             newCount++;
            }
             s+=doWork(arr, range, n, k, pos+1, newCount);
   }
   return s;
}
}