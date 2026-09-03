class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean odd = false;
        for(int i = 0; i<nums1.length;i++)
        {
               min = Math.min(min,nums1[i]);
               if(nums1[i]%2!=0)
               odd = true;
        }
        if(min%2!=0)
        {
            return true;
        }
        if(odd)
        return false;
        else
        return true;
    }
}