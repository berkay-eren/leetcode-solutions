// Last updated: 10/08/2025, 02:00:02
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int[] customer: accounts) {
            int wealth = 0;
            
            for(int bank: customer) {
                wealth += bank;
            }

            max = Math.max(max,wealth);
        }
        
        return max;
    }
}