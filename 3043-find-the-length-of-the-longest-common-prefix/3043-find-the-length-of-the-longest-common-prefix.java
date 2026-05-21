class Solution {
    public int digits(int n)
    {
        int cnt = 0;
        while(n>0)
        {
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num:arr1)
        {
            int x = num;
            while(x>0)
            {
               hs.add(x);
               x/=10;

            }
        }
        int res = 0;
        for(int num:arr2)
        {
            int x = num;
            int len = digits(num);
            while(x>0)
            {
                if(hs.contains(x))
                {
                    res = Math.max(res,len);
                    break;
                }
                x/=10;
                len--;
            }
        }
       return res; 
    }
}