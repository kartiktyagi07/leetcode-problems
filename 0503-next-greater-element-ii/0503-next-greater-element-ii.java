class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<2*n;i++){
            int idx=i%n;
            int curr=arr[idx];
            while(!st.isEmpty() && arr[st.peek()]<curr){
                map.put(st.pop(),curr);
            }
            if(i<n){
                st.push(i);
            }
        }
        for (int i = 0; i < n; i++) {
            ans[i] = map.getOrDefault(i, -1);
        }
        return ans;
    }
}