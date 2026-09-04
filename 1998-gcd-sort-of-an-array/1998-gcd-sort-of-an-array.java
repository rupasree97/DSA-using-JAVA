class Solution {

    int[] parent;

    public boolean gcdSort(int[] nums) {

        int max = 100000;
        //spf
        int spf[] = new int[max+1];
        for(int i = 0; i<=max;i++)
        {
            spf[i] = i;
        }
        for(int i = 2; i*i<=max;i++)
        {
            if(spf[i]==i)
            {
            for(int j = i*i;j<=max;j+=i)
            {
                if(spf[j] == j)
                spf[j] = i;
            }
            }
        }
        //dsu
        parent = new int[max+1];
        for(int i =0; i<=max;i++)
        {
            parent[i] = i;
        }
        for(int num:nums)
        {
           int  x = num;
            while(x > 1)
            {
               int prime = spf[x];
               union(num,prime);
               while(x%prime == 0)
               x = x/prime;
            }
        }
        //comparing with sorted array
        int sorted[] = nums.clone();
        Arrays.sort(sorted);
        for(int i = 0; i<nums.length;i++)
        {
            if(find(sorted[i]) != find(nums[i]))
            return false;
            
        }

       return true;

      
    }
    private int find(int x)
    {
        if(parent[x] == x)
        return x;
        return parent[x] = find(parent[x]);
    }
    private void union(int a,int b)
    {
        int root1 = find(a);
        int root2 = find(b);
        if(root1!=root2)
        parent[root1] = root2;
    }
}