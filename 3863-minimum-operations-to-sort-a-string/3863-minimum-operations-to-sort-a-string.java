class Solution {
    public int minOperations(String s) {
        char [] sorted = s.toCharArray();
        Arrays.sort(sorted);
        String res  = new String(sorted);
        if(s.equals(res))
            return 0;
        if(s.length()==2)
            return -1;
        char min = sorted[0];
        char max = sorted[s.length()-1];
        if(s.charAt(0) == min || s.charAt(s.length()-1) == max)
            return 1;
        if(s.charAt(0) == max && s.charAt(s.length()-1) == min)
        {
            boolean min_flag = false;
            for(int i = 0; i<s.length()-1; i++)
                {
                    if(s.charAt(i) == min)
                        min_flag = true;
                }
            boolean max_flag = false;
            for(int i = 1; i<s.length()-1; i++)
                {
                    if(s.charAt(i) == max)
                        max_flag = true;
                }
            if(min_flag|| max_flag) return 2;
            return 3;
        }
     
       return 2; 
        
        
    }
}