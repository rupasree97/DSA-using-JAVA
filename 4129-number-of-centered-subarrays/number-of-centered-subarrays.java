class Solution {
    public int centeredSubarrays(int[] nums) {
       int count = 0, sum =0;
       for(int i = 0; i<nums.length;i++)
       {
        sum = 0;
       HashSet <Integer> set = new HashSet<>();
       for(int j=i;j<nums.length;j++)
       {
           sum+=nums[j];
           set.add(nums[j]);
           if(set.contains(sum)) count++;

       }
       }
   return count; 
    }
}