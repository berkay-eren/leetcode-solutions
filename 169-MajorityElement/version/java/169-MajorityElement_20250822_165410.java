// Last updated: 22/08/2025, 16:54:10
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int size = nums.length;
        int majority = size / 2;

        for(int i = 0; i < size; i++){
           map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key: map.keySet()) {
            if(map.get(key) > majority) return key;
        }

        return -1;
    }
}