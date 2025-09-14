class Solution {
    public int maxArea(int[] height) {
        int ans  = 0;
        int n = height.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int ht = Math.min(height[i],height[j]);
            int area = ht*(j-i);
            ans = Math.max(ans,area);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return ans;
    }
}