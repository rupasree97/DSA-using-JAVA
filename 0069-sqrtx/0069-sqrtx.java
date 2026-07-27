class Solution {
    public int mySqrt(int x) {
        if(x == 0|| x == 1)
        return x;
        int left = 1;
        int mid = -1;
        int right = x;
     
        while(left<=right)
        {
             mid =left + (right-left) /2;
            if(mid * mid == x)
              return mid;
            else if((long)mid * mid >(long) x)
            right =mid-1;
            else
            left  =mid+1;
          
        }
        return Math.round(right);
         
    }
}