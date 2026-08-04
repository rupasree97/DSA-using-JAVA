class Solution {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
      int freq[] = new int[128];

        for(char c: s.toCharArray())
        {
            freq[c]++;
        }
        int n = s.length();
        while(res.length()< n)
        {
            int max = 0;
            for(int i = 1; i<128;i++)
            {
                if(freq[i]>freq[max])
                {
                    max = i;
                }
            }
            for(int i = 0; i<freq[max];i++)
            {
                res.append((char)max);
            }
            freq[max]  = 0;

        }
 
      return res.toString();
    }
}