class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i = nums.length-1; i>=0; i--)
        {
            int val = nums[i];
            while(val>0)
           {
           arr.add(val%10);
           val/=10;
           }

        }
        Collections.reverse(arr);
        int a[] = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++)
        {
           a[i] = arr.get(i);
        }

        return a;

        
    }
}