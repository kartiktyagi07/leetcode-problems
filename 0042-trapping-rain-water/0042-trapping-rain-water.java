class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        int[] leftMaxArr = new int[n];
        leftMaxArr[0] = height[0];
        int leftMax = height[0];
        for(int i=1;i<n;i++){
            if(height[i]>leftMax){
                leftMax = height[i];
            }
            leftMaxArr[i] = leftMax;
        }
        int[] rightMaxArr = new int[n];
        rightMaxArr[n-1] = height[n-1];
        int rightMax = height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]>rightMax){
                rightMax = height[i];
            }
            rightMaxArr[i] = rightMax;
        }
        for(int i=0;i<n;i++){
            int water = Math.min(leftMaxArr[i],rightMaxArr[i]) - height[i];
            ans += water;
        }
        return ans;
    }
}