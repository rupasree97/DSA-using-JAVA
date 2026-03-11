class Solution {
    public String removeDuplicateLetters(String s) {
        int lastindex[] = new int[26];
        for(int i = 0 ; i<s.length(); i++)
        {
            lastindex[ s.charAt(i) - 'a'] = i;
        }
        Stack <Integer>  stack = new Stack();
        boolean[] seen = new boolean[26];
        for(int i = 0; i<s.length(); i++)
        {
             int curr = s.charAt(i) -'a';
             if(seen[curr]) continue;
       while(!stack.isEmpty() && stack.peek()>curr && i< lastindex[stack.peek()] )
       {
        seen[stack.pop()] = false;
       }
       stack.push(curr);
       seen[curr] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) 
        sb.append((char)( stack.pop() + 'a'));
                return sb.reverse().toString();

        
    }
}