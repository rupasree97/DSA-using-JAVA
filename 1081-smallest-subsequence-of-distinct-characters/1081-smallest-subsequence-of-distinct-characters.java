class Solution {
    public String smallestSubsequence(String s) {
          int seen[] = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            seen[s.charAt(i) - 'a'] = i;
        }
        boolean[] stack = new boolean[26];
        StringBuilder st = new StringBuilder();
        for(int i = 0; i<s.length(); i++)
        {
        char c = s.charAt(i);
        if(stack[c-'a'])
        continue;
       while(st.length()>0 && st.charAt(st.length()-1) > c  && seen[st.charAt(st.length()-1) - 'a' ] > i)
       {
               stack[st.charAt(st.length()-1) - 'a'] = false;
                st.deleteCharAt(st.length()-1);

       }

        st.append(c);
        stack[c-'a'] = true;
        }
        return st.toString();
    }
}