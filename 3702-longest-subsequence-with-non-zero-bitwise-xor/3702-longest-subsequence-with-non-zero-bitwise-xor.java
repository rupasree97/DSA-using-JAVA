class Solution {
    public int longestSubsequence(int[] nums) {
        int count = 0;
        int max = 0;
        int n = nums.length;
        int xor = 0;
        boolean flag = false;
     
    for(int i = 0; i<n;i++)
    {
        xor^=nums[i];
        if(nums[i]!=0)
        flag = true;
        
    }
    if(xor!=0)
    return n;
    else if(flag)
    return n-1;
    else
    return  0;

    }
}