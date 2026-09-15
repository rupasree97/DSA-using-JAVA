class Solution {
    
    void fun(int n,StringBuilder s,int open,int close,ArrayList<String> res)
    {
        if(open == n && close == n)
        {
             res.add(s.toString());
             return;
        }

        if(open < n)
        {
            s.append('(');
            fun(n,s,open+1,close,res);
            s.deleteCharAt(s.length()-1);
        }
        if(close < open)
        {
            s.append(')');
            fun(n,s,open,close+1,res);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        fun(n,new StringBuilder() ,0,0,res);
        return (res);
    }
}