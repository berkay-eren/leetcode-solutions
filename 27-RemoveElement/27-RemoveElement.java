// Last updated: 28/08/2025, 15:45:38
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