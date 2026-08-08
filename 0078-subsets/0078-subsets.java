class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  l = new   ArrayList<>();
         int n = nums.length;
        for(int i = 0; i<(1<<n); i++)
        {
            ArrayList<Integer> r = new ArrayList<>();
            for(int j = 0; j<n;j++)
            {
                 if((i&(1<<j)) > 0)
                 r.add(nums[j]);
            }
            l.add(r);
        }
       return l; 
    }
}