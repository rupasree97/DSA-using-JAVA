class Solution {
    public int integerReplacement(int n) {
int cnt = 0;
long  m = n;
while(m!=1)
{
        if(m%2==0)
        {
            m = m/2;
            cnt++;
        }
        else
        {
          if(m==3 || m%4==1)
          m = m-1;
          else
          m= m+1;
        cnt++;
       }
        
}
 return cnt;
    }
}