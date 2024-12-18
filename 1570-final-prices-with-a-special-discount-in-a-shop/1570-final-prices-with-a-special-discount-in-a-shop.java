class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[prices.length];
        for (int i = 0; i < n; i++) {
            ans[i] = prices[i];      
        }
        for(int i=0;i<prices.length;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int idx=st.pop();
                ans[idx]-=prices[i];
            }
            st.push(i);
        }

        return ans;
        
    }
    
}