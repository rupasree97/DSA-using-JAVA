class Solution {
    private int gcd(int a,int b)
    {
      
        while(b!=0)
        {
         int temp = a%b;
         a = b;
         b = temp;
        }
        return a;
        

        
    }
    private int lcm(int a1,int b1)
    {
        return (a1/gcd(a1,b1))*b1;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
       for(int x:nums)
       {
         while(!res.isEmpty())
         {
            int last = res.get(res.size()-1);
            if(gcd(x,last) == 1)
            break;
            x = lcm(x,last);
            res.remove(res.size()-1);

         }
         res.add(x);

       }
        
      return res;
    }
}