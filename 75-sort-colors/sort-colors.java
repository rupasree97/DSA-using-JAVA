class Solution {
    public void sortColors(int[] nums) {
        //count 0's ,1's 2's
        //over-write the  given array
        // int red = 0, white = 0,blue = nums.length-1;
        // while(white<=blue)
        // {
        //     if(nums[white]==0)
        //     {
        //        int temp = nums[white];
        //         nums[white] = nums[red];
        //         nums[red] = temp; 
        //         white++;
        //         red++;
        //     }
        //     else if(nums[white]==1)
        //     {
        //         white++;
        //     }
        //     else
        //     {
        //         int temp = nums[white];
        //         nums[white] = nums[blue];
        //         nums[blue] = temp;
        //         blue--;
        //     }

        // }

        int zeros = 0,ones = 0,twos = 0;
        for(int i = 0; i<=nums.length-1;i++)
        {
            if(nums[i]==0)
            zeros++;
            else if(nums[i] == 1)
            ones++;
            else
            twos++;

        }
        int idx = 0;
        while(zeros > 0)
        {
        nums[idx++] = 0;
        zeros--;
        }
       while(ones>0)
       {
       nums[idx++] = 1;
       ones--;
       }
       while(twos>0)
       {
       nums[idx++] = 2;
       twos--;
       }


        
 
        


        
    }
}