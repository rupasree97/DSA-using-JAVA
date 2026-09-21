class Solution {
          List<List<Integer>> res = new ArrayList<>();
    private void fun(int nums[],ArrayList<Integer> temp,boolean used[])
    {
     if(nums.length == temp.size())
     {
     res.add(new ArrayList<>(temp));
     return;
     }
     for(int i = 0; i<nums.length;i++)
     {
        if(used[i]) continue;
        temp.add(nums[i]);
        used[i] = true;
       fun(nums,temp,used);
       temp.remove(temp.size()-1);
       used[i] = false;
     }



    }
    public List<List<Integer>> permute(int[] nums) {
  
        boolean used[] = new boolean[nums.length];
        fun(nums,new ArrayList<>(),used);
        return res;
    }

} 