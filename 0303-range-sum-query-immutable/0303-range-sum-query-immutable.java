class NumArray {


        int prefixsum[] ;
    public NumArray(int[] nums) {
       prefixsum = new int[nums.length];
        int curr = 0;
        for(int i = 0; i<nums.length; i++)
        {
             curr += nums[i];
            prefixsum[i]= curr;
        }
    


    }
    
    public int sumRange(int left, int right) {
        
     
          if(left==0)
          return prefixsum[right];
          else
          return prefixsum[right] - prefixsum[left-1];


    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */