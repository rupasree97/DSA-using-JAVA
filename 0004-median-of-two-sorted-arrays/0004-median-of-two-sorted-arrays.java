class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int i = 0;
        int j = 0;
        double curr = 0,prev = 0;
        for(int m = 0; m<=n/2; m++)
        {
            prev = curr;
            if(i<nums1.length && (j>=nums2.length || nums1[i] <= nums2[j]))
            {
                curr = nums1[i];
                i++;
            }
            else
            {
                curr = nums2[j];
                j++;
            }

        }
       if(n%2!=0)
       {
        return curr;
       } 
       else
       {
         return (prev+curr)/2;
       }
        
    }
}