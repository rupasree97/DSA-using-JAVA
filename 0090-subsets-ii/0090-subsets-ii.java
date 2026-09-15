class Solution {
    Set<List<Integer>> h = new HashSet<>();
     private void subsetgen(int nums[],int i,  ArrayList<Integer> s)
    {
    
        Arrays.sort(nums);
        if (i == nums.length) {
    h.add(new ArrayList<>(s));
    return;
}

        s.add(nums[i]);
       
        subsetgen(nums,i+1,s);

        s.remove(s.size()-1);
        subsetgen(nums,i+1,s); 
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
        subsetgen(nums,0,new ArrayList<>());
        return new ArrayList<>(h);
    }
}