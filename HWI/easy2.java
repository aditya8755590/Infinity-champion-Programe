package HWI;

import java.util.HashMap;
import java.util.Scanner;

public class easy2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(maximumSubarraySum(arr,k));
    }

     public static long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        long ans=0;
        long sum=0;
        for(int i=0;i<n;i++){

        map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        sum+=nums[i];
        ans=Math.max(ans,sum);

        if(map.size()>k){

            while(!map.isEmpty()&&j<=i&&map.size()>k){

                map.put(nums[j],map.get(nums[j])-1);

                 sum-=nums[j];
                ans=Math.max(ans,sum);
                if(map.get(nums[j])==0){
                    map.remove(nums[j]);
                }
                j++;
            }
        }
        }
        return ans;
    }
    
}
