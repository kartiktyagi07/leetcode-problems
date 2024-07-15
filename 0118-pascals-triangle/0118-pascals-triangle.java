class Solution {
    public List<List<Integer>> generate(int numRows) {
        // we will generate a final answer list in which we store all the returned row's list from our function
        List<List<Integer>> finalans=new ArrayList();
        for(int i=1;i<=numRows;i++){
            finalans.add(generaterow(i));
        }
        return finalans;
        
    }
    // here we make a function to calculate an individual row
    public List<Integer> generaterow(int row){
        // as first element is 1 so we initialize ans by 1.
        int ans=1; 
        // to add an entire row we make a arraylist so we can store the row in the form of list
        List<Integer> ansrow=new ArrayList<>();
        // here we add first item that is 1
        ansrow.add(ans);
        for(int i=1;i<row;i++){
            ans= ans*(row-i);
            ans=ans/i;
            ansrow.add(ans);
        }
        return ansrow;
    }
}