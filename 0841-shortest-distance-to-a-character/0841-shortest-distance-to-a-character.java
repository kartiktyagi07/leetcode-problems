class Solution {
    public int[] shortestToChar(String s, char c) {
        // TC:O(n*m) n->length of string m->no. of occurence of c
        // SC:O(n+m)

        // int n=s.length();
        // int[] ans=new int[n];
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)==c){
        //         list.add(i);
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     int min=findMin(list,i);
        //     ans[i]=min;
        // }
        // return ans;

        // TC:O(N+M) SC:O(N+M)
        int n=s.length();
        int[] ans=new int[n];
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                list.add(i);
            }
        }
        int j=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            while(j<list.size()-1 && Math.abs(list.get(j+1)-i)<=Math.abs(list.get(j)-i)){
                j++;
            }
            ans[i]=Math.abs(list.get(j)-i);
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