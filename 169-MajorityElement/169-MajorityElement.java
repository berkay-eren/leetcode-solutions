// Last updated: 28/08/2025, 15:45:36
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int size = nums.length;

        for(int i = 0; i < size; i++){
           map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key: map.keySet()) {
            if(map.get(key) > (size / 2)) return key;
        }

        return -1;
    }
}