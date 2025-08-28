// Last updated: 28/08/2025, 15:45:23
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