class Solution {
    public boolean checkIfPangram(String sentence) {
       
        boolean ispanagram = true;
        for(char c = 'a'; c<='z'; c++)
        {
            if(sentence.indexOf(c) == -1)
            {
            ispanagram = false;
            break;
        }

        }

    
      return ispanagram;
        
    }
}