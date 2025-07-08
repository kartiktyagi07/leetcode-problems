class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int first=height[i];
            int second=height[j];
            int area=Math.min(first,second)*(j-i);
            ans=Math.max(ans,area);
            if(first<second){
                i++;
            }else{
                j--;
            }
        }
        return ans;    
    }
}