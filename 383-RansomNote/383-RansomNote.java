// Last updated: 28/08/2025, 15:45:31
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char m = magazine.charAt(i);

            int count = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, count+1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char r = ransomNote.charAt(i);
            int count = magazineLetters.getOrDefault(r, 0);

            if(count == 0) return false;

            magazineLetters.put(r, count - 1);
        }

        return true;
    }
}