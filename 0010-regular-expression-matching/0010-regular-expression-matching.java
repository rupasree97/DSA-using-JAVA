class Solution {
    boolean fun(String s,String p,int i,int j)
    {
        if(j == p.length())
        {
            if(i == s.length())
            {
                return true;
            }
            return false;
        }

        if(i == s.length())
        {
            if(j+1 < p.length() && p.charAt(j+1) == '*')
            {
                return fun(s,p,i,j+2);
            }
            return false;
        }
 
        boolean same = false;

        if(s.charAt(i) == p.charAt(j))
            same = true;

        if(p.charAt(j) == '.')
            same = true;

        if(j+1 < p.length() && p.charAt(j+1) == '*')
        {
            if(!same)
                return fun(s,p,i,j+2);

            boolean skip = fun(s,p,i,j+2);

            boolean take = fun(s,p,i+1,j);

            return skip || take;
        }

        if(!same)
            return false;

        return fun(s,p,i+1,j+1);
    }

    public boolean isMatch(String s, String p)
    {
        boolean res = fun(s,p,0,0);
        return res;
    }
}