// Last updated: 28/08/2025, 15:45:28
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word: words){
            StringBuilder reversed = new StringBuilder(word).reverse();
            res.append(reversed).append(" ");
        }
        return res.toString().trim();
    }
}