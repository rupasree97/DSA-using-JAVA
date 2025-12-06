class Solution {
    public int maxArea(int[] height) {
     int left = 0;
     int right = height.length-1;
     int Maxarea = Integer.MIN_VALUE;
     while(left<right)
     {
        int currarea = (right-left)*Math.min(height[left], height[right]);
        Maxarea = Math.max(Maxarea,currarea);    
        if(height[left]<height[right])
        {
            left++;
        }  
        else
        {
            right--;
        }    
        }
return Maxarea;
    }
}