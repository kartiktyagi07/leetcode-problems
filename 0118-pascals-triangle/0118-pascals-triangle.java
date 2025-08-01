class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(helper(i));
        }
        return ans;
    }
    public List<Integer> helper(int n){
        ArrayList<Integer> temp = new ArrayList<>();
        int x=1;
        temp.add(x);
        for(int i=1;i<n;i++){
            x=x*(n-i);
            x=x/i;
            temp.add(x);
        }
        return temp;
    }
}