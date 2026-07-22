class Solution {
    public List<Integer> getRow(int rowIndex) {
           ArrayList <Integer> row = new ArrayList<>();
           row.add(1);
           for(int i = 0; i<rowIndex; i++ )
           {

           ArrayList <Integer> newrow = new ArrayList<>();
           newrow.add(1);
            for(int j = 1; j<row.size(); j++)
            {
                   newrow.add( row.get(j) + row.get(j-1));
            }
            newrow.add(1);
           row =  newrow ;

           } 


           return row;    
    }
}