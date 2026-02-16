class Solution {
    public int mySqrt(int x) {
        if(x<2)
        {
            return x; //x= 0,1
        }
    int left = 1,right = x/2;
       

         while(left<=right)
         {
            int mid = (left+right)/2;
            long res = (long) mid*mid;
            if(res==x)
            return mid;
            else if (res<x)
            left = mid+1;
            else
            right = mid-1;

         }
        
     return right;   
    }
}