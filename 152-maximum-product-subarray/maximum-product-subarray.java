class Solution {
    public int maxProduct(int[] nums) {
        int max_product = Integer.MIN_VALUE;
        int product = 1;
        for(int i = 0; i<nums.length;i++)
        {
            product*=nums[i];
            max_product = Math.max(max_product, product);
            if(product==0)
            product = 1;

        }
        product = 1;
        for(int i = nums.length-1; i>=0;i--)
        {
            product*=nums[i];
            max_product = Math.max(product,max_product);
            if(product==0)
            product = 1;
        }

        return max_product;
    }
}