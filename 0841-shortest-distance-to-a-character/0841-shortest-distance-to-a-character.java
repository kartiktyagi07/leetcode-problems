class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] ans=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                list.add(i);
            }
        }
        for(int i=0;i<n;i++){
            int min=findMin(list,i);
            ans[i]=min;
        }
        return ans;
    }
    public static int findMin(ArrayList<Integer> list,int j){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(Math.abs(list.get(i)-j)<min){
                min=Math.abs(list.get(i)-j);
            }
        }
        return min;
    }
}