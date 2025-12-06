class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map <Integer, Integer> counter = new HashMap <>();
    int n = nums.length;
    for(int i = 0 ; i<n; i++)
    {
        int compliment = target-nums[i];
        if(counter.containsKey(compliment))
        {
               return new int[] { counter.get(compliment),i};
        }
        counter.put(nums[i],i);

         
    }
    return new int[]{};
   
    }
}