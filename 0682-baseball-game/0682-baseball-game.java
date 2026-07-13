class Solution {
    public int calPoints(String[] operations) {
    // Stack <Integer> res = new Stack<>();
    // int score = 0;
    // for(String s : operations)
    // {
    //     if(s == "C" && !res.isEmpty())
    //     {
    //         res.pop();
    //     }
    //     else if(s == 'D' && !res.isEmpty())
    //     {
    //         int c = res.peek();
    //         res.push(2*c);
    //     }
    //     else if(s == '+'  && !res.isEmpty())
    //     {
          
    //     }
    //     else
    //     {
    //         int c = s;
    //         res.push(c);
    //     }
    // }

    int n = operations.length;
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0; i<n; i++)
    {
        if(operations[i].equals("C")  )
        {
                arr.remove(arr.size()-1);
        }
       else if(operations[i].equals("D")  )
        {
            arr.add(arr.get(arr.size()-1) * 2);
        }
       else if(operations[i].equals("+"))
       {
             arr.add(arr.get(arr.size()-1) + arr.get(arr.size()-2));
       }
       else
       {
        int value = Integer.parseInt(operations[i]);
        arr.add(value);
       }
    }
    int sum = 0;
    for(int i = 0; i<arr.size(); i++)
    {
        sum+=arr.get(i);
    }
    
      return sum;    
    }
}