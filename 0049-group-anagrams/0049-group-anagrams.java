class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap<>();
        for(String s:strs)
        {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!hs.containsKey(key))
            {
                hs.put(key,new ArrayList<>());
            }
            hs.get(key).add(s);
       
        }
        return new ArrayList<>(hs.values());
    }
}