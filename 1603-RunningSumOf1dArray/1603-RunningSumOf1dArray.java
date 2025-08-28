// Last updated: 28/08/2025, 15:45:24
class Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i-1];
        }

        return results;
    }
}