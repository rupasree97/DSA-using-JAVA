class Solution {
    public List<Integer> findAnagrams(String s, String p) {
            ArrayList<Integer> res = new ArrayList<>();
    if(s.length() < p.length())
    return res;

    int pcount[] = new int[26];
    int window[] = new int[26];
    int windowsize = p.length();
    for(char c : p.toCharArray())
    {
        pcount[c-'a']++;
    }
    int right = 0,left = 0;
    while(right<s.length())
    {
      window[s.charAt(right)-'a']++;
      right++;
      if(right-left>windowsize)
      {
       window[s.charAt(left)-'a']--;
       left++;
      }
      if(right-left==windowsize && Arrays.equals(window,pcount))
      {
        res.add(left);
      }
    }

return res;
        
    }
}