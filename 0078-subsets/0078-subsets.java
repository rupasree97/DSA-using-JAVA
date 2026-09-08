class Solution {
    private void subsetgen(int nums[],int i, List<List<Integer>> l, ArrayList<Integer> s)
    {
    
        if (i == nums.length) {
    l.add(new ArrayList<>(s));
    return;
}
        s.add(nums[i]);
       
        subsetgen(nums,i+1,l,s);

        s.remove(s.size()-1);
        subsetgen(nums,i+1,l,s); 
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        subsetgen(nums,0,l,new ArrayList<>());
        return l;
    }
}