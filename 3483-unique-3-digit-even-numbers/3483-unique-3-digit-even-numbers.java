class Solution {
      HashSet<Integer> set = new HashSet<>();
       boolean[] used;
     
    void fun(int [] digits,int position, int n,int num)
    {
        
        if(position == 3)
        {
           set.add(num);
           return;
        }
        for(int i = 0; i<n;i++)
        {
            if(used[i])
            continue;
            if(digits[i]==0 && position == 0)
            continue;
            if(digits[i]%2!=0 && position == 2)
            continue; 
         if (i > 0 && digits[i] == digits[i - 1] && !used[i - 1])
                continue;
                  
            used[i] = true;
            fun(digits,position+1,n,num*10+ digits[i]);
            used[i] = false;
            
        }
    }
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        used = new boolean[n];
        fun( digits,0, n,0);
        return set.size();
    }
}