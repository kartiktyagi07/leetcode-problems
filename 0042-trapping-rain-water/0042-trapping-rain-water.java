class Solution {
    public int trap(int[] height) {
        int ans=0;
        int n=height.length;
        // Building an array for leftMax
        int[] leftMax=new int[n];
        leftMax[0]=height[0];
        int left_max=height[0];
        for(int i=1;i<n;i++){
            if(height[i]>left_max){
                left_max=height[i];
            }
            leftMax[i]=left_max;
        }

        // Building an array for rightMax
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        int right_max = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (height[i] > right_max) {
                right_max = height[i];
            }
            rightMax[i] = right_max;
        }

        //Traversing the original answer and building the answer
        for(int i=0;i<n;i++){
            int water=Math.min(leftMax[i],rightMax[i])-height[i];
            ans+=water;
        }
        return ans;
    }
}