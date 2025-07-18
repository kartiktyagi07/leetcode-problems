class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        int idx=0;
        int j=0;
        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.removeFirst();
            }
            if(i-j+1==k){
                ans[idx]=nums[deque.peekFirst()];
                idx++;
                j++;
            }
        }
        return ans;
    }
}