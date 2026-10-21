class Solution {
    public int minOperations(String s) {
        char r[] = s.toCharArray();
         Arrays.sort(r);
         String res = new String(r);
        if(s.equals(res))
        {
          return  0;  
        }
        else if(s.length() == 2)
        return -1;
        char min = r[0];
        char max = r[s.length()-1];
        if(s.charAt(0) == min || s.charAt(s.length()-1) == max)
        return 1;
        if(s.charAt(0) == max || s.charAt(s.length()-1) == min)
        {
            boolean min_flag = false;
            for(int i = 0; i<s.length()-1; i++)
            {
                   if(s.charAt(i) == min)
                   {
                    min_flag = true;
                   }
            }
            boolean max_flag = false;
            for(int i = 1; i<s.length()-1;i++)
            {
                if(s.charAt(i) == max)
                {
                    max_flag = true;
                }
            }
              if(max_flag || min_flag) return 2;
                return 3;
            

        }  
        return 2;
    }
}