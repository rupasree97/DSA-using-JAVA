class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int count[] = new int[26];
        int ans = 0;
    
      
        for(int i = 0; i<n;i++)
        {
            int maxcount = 0, distinct_var = 0;
              Arrays.fill(count,0);
            for(int j = i; j<n; j++)
            {
                int c = s.charAt(j) - 'a';
                if(++count[c]==1)
                 distinct_var++;
                 maxcount = Math.max(maxcount,count[c]);
                 if(maxcount * distinct_var == j-i+1)
                 {
                    ans = Math.max(ans, j-i+1);
                 }

                


            }
            

        }
        
        return ans;
    }
}