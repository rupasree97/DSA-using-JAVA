class Solution {
    void fun(int s,int n,int k, ArrayList<List<Integer>> res, ArrayList<Integer> r)
    {

           if(k == r.size())
           {
            res.add(new ArrayList<>(r));
            return;
           }
           for(int i = s; i<=n;i++)
           {
            r.add(i);
            fun(i+1,n,k,res,r);
            r.remove(r.size()-1);

           }

    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        fun(1,n,k,res, new ArrayList<>());
        return res;
    }
} 