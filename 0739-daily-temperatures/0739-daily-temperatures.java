class Solution {
    public int[] dailyTemperatures(int[] temp) {
        // Brute Force Correct but it gives TLE

        // int n=temp.length;
        // int[] ans=new int[temp.length];
        // for(int i=0;i<n;i++){
        //     int cnt=0;
        //     int j=i+1;
        //     boolean flag=false;
        //     while(j<n){
        //         cnt++;
        //         if(temp[j]>temp[i]){
        //             flag=true;
        //             break;
        //         }
        //         j++;
        //     }
        //     ans[i]=flag?cnt:0;
        // }
        // return ans;
        

        int n=temp.length;
        int[] ans=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                int a=st.pop();
                ans[a]=i-a;
            }
            st.push(i);
        }
        return ans;
    }
}