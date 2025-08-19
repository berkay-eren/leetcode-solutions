// Last updated: 19/08/2025, 17:06:26
// solve with hashset
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums) {
            if(seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}