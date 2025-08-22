// Last updated: 22/08/2025, 14:48:17
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int size = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[size++] = nums[i];
            }
        }
        return size;
    }
}