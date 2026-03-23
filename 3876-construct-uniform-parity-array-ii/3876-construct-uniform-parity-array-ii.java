class Solution {
    public boolean uniformArray(int[] nums1) {
        long min = Integer.MAX_VALUE;
        boolean oddnum = false;
        for(int i = 0; i<nums1.length; i++)
            {
                if(nums1[i] < min)
                {
                    min = nums1[i];
                }
                if(nums1[i]%2!=0)
                    oddnum = true;

                
            }
        if(min%2!=0)
            return true;

        if(oddnum)
            return false;
        else
            return true;
        
    }
}