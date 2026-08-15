class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int min = Math.min(n,m);
        int res[] = new int[min];
        HashMap<Integer,Integer> h = new HashMap<>();
        int idx = 0;
        for(int i = 0; i<nums1.length;i++)
        {
             h.put(nums1[i], h.getOrDefault(nums1[i],0)+1);
        }
        for(int i = 0; i<nums2.length; i++)
        {
            if(h.containsKey(nums2[i]) && h.get(nums2[i]) > 0)
            {
                res[idx]  = nums2[i];
                idx++;
                h.put(nums2[i] , h.get(nums2[i]) -1);
            }

        }
        return Arrays.copyOf(res,idx);
       
         
    }
}