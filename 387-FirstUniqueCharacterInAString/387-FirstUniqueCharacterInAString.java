// Last updated: 28/08/2025, 15:45:30
class Solution {
    public int firstUniqChar(String s) {
        int charcnt[] = new int[26];

        for(int i = 0; i < s.length(); i++) {
            charcnt[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(charcnt[s.charAt(i) - 'a'] == 1) return i;
        }
        
        return -1;
    }
}