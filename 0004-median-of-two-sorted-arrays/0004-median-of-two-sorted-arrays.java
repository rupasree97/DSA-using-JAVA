class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;
        int n = nums1.length + nums2.length;
        double temp [] = new double[n];
      for (int i = 0; i < nums1.length; i++)
        {
            
            temp[i]=nums1[i];
        }
        for(int j = 0; j<nums2.length; j++)
        {
            temp[nums1.length+ j]=nums2[j];
        }
        Arrays.sort(temp);
         if(n%2!=0)
         {
            return temp[n/2];
         }
         return (temp[n/2] + temp[n/2-1] )/2;
    }
}