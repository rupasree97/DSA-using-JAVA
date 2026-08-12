class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int max = 0;
        int count = 0;
        int l = 0;
        int n = arr.length;
        int sum  = 0;
        int avg = 0;
        for(int r = 0; r<n;r++)
        {
            sum+=arr[r];
            avg = sum/(r-l+1);
            if(r-l+1 >k)
            {
                sum-=arr[l];
                l++;
                avg = sum/(r-l+1);
            }
            if(r-l+1 == k && avg>=threshold)
            {
                count++;
            }
            
        }
        return count;
    }
}