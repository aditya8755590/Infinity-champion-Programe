class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
         int k=i+1,j=n-1;
         if(i>0&&nums[i]==nums[i-1]) continue;
         while(k<j){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<0){
                k++;
            }
            else if(sum>0){
                j--;
            }
            else{
                result.add(new ArrayList<>(Arrays.asList(nums[i],nums[k],nums[j])));
                
                while(k<j&&nums[k]==nums[k+1]) k++;
                while(j>k&&nums[j]==nums[j-1]) j--;
                j--;
                k++;
            }
         }
        }
        return result;
    }
}