// Last updated: 28/08/2025, 15:45:35
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