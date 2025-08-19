// Last updated: 19/08/2025, 16:59:08
// sort and traverse
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}