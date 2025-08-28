// Last updated: 28/08/2025, 15:45:37
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            String key = generateKey(str);

            if(map.containsKey(key)){
                map.get(key).add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }

    private String generateKey(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}