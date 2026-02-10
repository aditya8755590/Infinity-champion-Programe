package HWI;

import java.util.Scanner;

public class easy1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int q=sc.nextInt();
        int sum=0;
        int mod=1_000_000_007;
        while(q>0){
            int type=sc.nextInt();
            int left=sc.nextInt();
            int right=sc.nextInt();
            if(type==1){
                // replace 

                for(int i=left;i<=right;i++){
                    arr[i]=(i-left+1)*arr[left];
                }
            }
            else{
                for(int i=left;i<=right;i++){
                    sum=(sum+arr[i])%mod;
                }
            }
            q--;
        }
        System.out.println(sum);
    }
}