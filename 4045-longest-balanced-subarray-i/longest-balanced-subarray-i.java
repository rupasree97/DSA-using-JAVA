class Solution {
    public int longestBalanced(int[] nums) {
        if(nums.length==1)
        return 0;
        int Maxlen = 0;
        for(int i = 0; i<nums.length; i++)
        {
        HashSet <Integer> oddnums = new HashSet<>();
        HashSet <Integer> evennums = new HashSet<>();
        for(int j = i; j<nums.length;j++)
        {
            if(nums[j]%2==0)
            {
                evennums.add(nums[j]);
            }
            else if(nums[j]%2!=0)
            {
                oddnums.add(nums[j]);
            }
        
            if(evennums.size() == oddnums.size())
            {
                 Maxlen = Math.max(Maxlen,j-i+1);
            }
        }
        

        }
      return Maxlen;  
    }
}