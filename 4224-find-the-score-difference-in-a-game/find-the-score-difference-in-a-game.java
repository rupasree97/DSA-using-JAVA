class Solution {
    public int scoreDifference(int[] nums) {
        int p1score = 0;
        int p2score = 0;
        boolean p1 = true;
        for(int i = 0; i<nums.length;i++)
            {
                if(nums[i]%2==1)
                {
                  p1 = !p1;
                }
                if((i+1 )%6 == 0)
                {
                    p1 = !p1;
                }
                if(p1)
                {
                    p1score+=nums[i];
                }
                else
                {
                    p2score+=nums[i];
                }
            }
        return p1score - p2score;
    }
}