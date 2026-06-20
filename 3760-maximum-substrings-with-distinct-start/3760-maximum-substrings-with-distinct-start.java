class Solution {
    public int maxDistinct(String s) {
        int count = 0;
     
       boolean seen[] = new boolean[26];
       int idx = 0;
        for(int i = 0; i<s.length(); i++)
        {
            idx = s.charAt(i) -'a';
            if(!seen[idx] )
            {
             count++;
             seen[idx] = true;
            
            }
        
        }
        return count;
    }
}