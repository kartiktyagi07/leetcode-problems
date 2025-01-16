class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
          // Approach -1 Brute Force Approach 
        // int[] nums3=new int[nums2.length*nums1.length];
        // int idx=0;
        // int ans=0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         nums3[idx]=nums1[i]^nums2[j];
        //         ans^=nums3[idx];
        //         idx++;
        //     }
        // }
        // return ans;


        // Approach 2
        int ans=0;
        if(nums1.length%2==0 && nums2.length%2==0){
            return 0;
        }
        if(nums1.length%2!=0){
            for(int x:nums2){
                ans^=x;
            }
        }
        if(nums2.length%2!=0){
            for(int x:nums1){
                ans^=x;
            }
        }
        return ans;
    }
}