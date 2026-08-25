class Solution {
    public int maximumPrimeDifference(int[] nums) {
       int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
       boolean isprime[] = new boolean[101];
       for(int p : primes)
       {
        isprime[p] = true;
       }
       int first = -1;
       int last = -1;
       for(int i = 0; i<nums.length;i++)
       {
        if(isprime[nums[i]])
        {
            if(first==-1)
            first = i;

            last = i;
        }
       }
        return Math.abs(last-first);
    }
}