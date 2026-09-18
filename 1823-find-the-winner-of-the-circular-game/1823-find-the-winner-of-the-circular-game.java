class Solution {
    Queue<Integer> q;
    void fun(int n,int k, Queue<Integer> q)
    {
            if(q.size() == 1)
            {
            return;
            }
          
           for(int i =1;i<k;i++)
           {
            q.add(q.remove());
           }
           q.remove();
           fun(n,k,q);
           

       
    }
    public int findTheWinner(int n, int k) {
         q = new LinkedList<>();
          for(int i = 1;i<=n;i++)
           {
           q.add(i);

           }
        fun(n,k, q);
        return q.peek();
    }
}