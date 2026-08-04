class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int max = nums[0];
        int min = nums[0];
        for(int i = 0 ;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
    
        for(int i = 0; i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = min; i<=max; i++)
        {
                 if(!l.contains(i))
                 {
                    res.add(i);
                 }
        }
        return res;
    }
}