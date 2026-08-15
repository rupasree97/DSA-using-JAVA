class Solution {
    public String reverseVowels(String s) {
        int l  = 0; 
        int r = s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] w = s.toCharArray();
        while(l<r)
        {
            while(l<r && vowels.indexOf(w[l]) == -1)
            {
                l++;
            }
            while(l<r && vowels.indexOf(w[r]) == -1)
            {
                r--;
            }
            char temp = w[l];
            w[l]  = w[r];
            w[r] = temp;
            l++;
            r--;
              
        } 
        return String.valueOf(w);
        
      }
}