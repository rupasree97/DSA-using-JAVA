class Solution {
    private void fun(int idx,int sum,int[] candidates,int target,ArrayList<List<Integer>> res, ArrayList<Integer> r)
    {
       
        if(sum  == target)
        {
            res.add(new ArrayList<>(r));
            return;
        }
           if (sum > target || idx == candidates.length) {
            return;
        }
        int c = 0;
        
        for(int i = idx; i<candidates.length;i++){
        
             if( i > idx && candidates[i] == candidates[i-1])
             {
                continue;
             }
             c = candidates[i];
            
             r.add(c);
            
            fun(i+1,c+sum,candidates,target,res,r); 
              r.remove(r.size()-1);

             }
            
                    
                          
                
        }


        
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
     Arrays.sort(candidates);
        fun(0,0,candidates,target,res,new ArrayList<>());
        return res;
    }
}