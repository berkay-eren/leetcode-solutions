// Last updated: 28/08/2025, 15:45:41
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }

            map.put(current,i);
        }

         throw new IllegalArgumentException("No two sum solution found");
    }
}