class Solution {
    public int firstMissingPositive(int[] nums) {
        //correct it position 
        // find the missing between 
        // return n+1 if not
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] != i + 1 && nums[i] > 0 && nums[i] <= n&&nums[i]!=nums[nums[i]-1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (nums[i - 1] != i) {
                return i;
            }
        }
        return n + 1;

    }
}