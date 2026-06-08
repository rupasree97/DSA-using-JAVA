class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
       ArrayList<Integer> r = new ArrayList<>();
       int res[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] < pivot)
            l.add(nums[i]);
            else if(nums[i] == pivot)
            m.add(nums[i]);
            else
            r.add(nums[i]);
        }
        int i = 0;
        for(int num: l)
         res[i++] = num;
        for(int num: m)
         res[i++] = num;
        for(int num : r)
         res[i++] = num;

        return res;
        
    }
}