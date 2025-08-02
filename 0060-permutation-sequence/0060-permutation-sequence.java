class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder input=new StringBuilder();
        for(int i=1;i<=n;i++){
            input.append(i);
        }
        String s=input.toString();
        ArrayList<String> ans=new ArrayList<>();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        boolean[] used=new boolean[n];
        helper(arr,n,ans,new StringBuilder(),used);
        return ans.get(k-1);
    }
    public void helper(char[] arr,int n,ArrayList<String> ans,StringBuilder temp,boolean[] used){
        if(temp.length()==n){
            ans.add(temp.toString());
            return;
        }
        for(int i=0;i<n;i++){
           if(used[i]) continue;
           if(i>0 && arr[i]==arr[i-1] && !used[i-1]) continue;
           used[i]=true;
           temp.append(arr[i]);
           helper(arr,n,ans,temp,used);
           temp.deleteCharAt(temp.length()-1);
           used[i]=false;
        }
    }
}