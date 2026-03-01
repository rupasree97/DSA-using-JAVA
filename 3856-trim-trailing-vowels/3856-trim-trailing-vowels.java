class Solution {
    public String trimTrailingVowels(String s) {
      int i = s.length()-1;
       while(i>=0 && isVowel(s.charAt(i)))
            {
               
                   i--;
                    
            }
        return s.substring(0,i+1);
        
    }
    private boolean isVowel(char c)
    {
        return "aeiou".indexOf(c)!=-1;
    }
}