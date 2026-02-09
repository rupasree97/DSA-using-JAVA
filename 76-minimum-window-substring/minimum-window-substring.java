class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        return "";
        Map <Character,Integer> charcount = new HashMap<>();
        for(char c:t.toCharArray())
        {
            charcount.put(c,charcount.getOrDefault(c,0)+1);
        }
        int targetchar_rem = t.length();
        int window[] = {0,Integer.MAX_VALUE};
        int left = 0;
        for(int right = 0; right<s.length(); right++)
        {
            char ch = s.charAt(right);
            if(charcount.containsKey(ch) && charcount.get(ch)>0)
            {
                targetchar_rem--;
            }
             charcount.put(ch,charcount.getOrDefault(ch,0)-1);
             if(targetchar_rem == 0){
                while(true)
                {
                    char charAtStart = s.charAt(left);
                    if(charcount.containsKey(charAtStart) && charcount.get(charAtStart)==0)
                    {
                        break;
                    }
                    charcount.put(charAtStart, charcount.getOrDefault(charAtStart,0)+1);
                    left++;
                }
                if(right-left < window[1] - window[0])
                {
                    window[0] = left;
                    window[1] = right;
                }
                charcount.put(s.charAt(left), charcount.getOrDefault(s.charAt(left),0)+1);
                targetchar_rem++;
                left++; 

             }

        }


       


        return window[1] >= s.length() ? "" : s.substring(window[0], window[1] + 1); 

        
    }
}