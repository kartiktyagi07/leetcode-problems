class Solution {
    public int maximumGap(int[] nums) {
        // TC:O(NLOGN) due to internal sorting SC:O(1)

        int ans=0;
        int n=nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int diff=nums[i+1]-nums[i];
            ans=Math.max(ans,diff);
        }
        return ans;



        // Actual Question is to solve it in O(N) so thats why we are using 
        // bucket sort to achieve O(N)
        // int n=nums.length;
        // int ans=0;
        // if(n<2) return 0;
        // // Sorting the array in O(n)
        
        // for(int i=0;i<n-1;i++){
        //     int diff=nums[i+1]-nums[i];
        //     ans=Math.max(ans,diff);
        // }
        // return ans;
    }
}