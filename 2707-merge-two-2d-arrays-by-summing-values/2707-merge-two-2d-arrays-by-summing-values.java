class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // max is taken to find the row size of resultant array which is
        //   maximum id value in both the array
        int max=0;
        for(int[] x:nums1){
            max=Math.max(max,x[0]);
        }
        for(int[] x:nums2){
            max=Math.max(max,x[0]);
        }
        // answer array is initialized with pointers
        int[][] ans=new int[max][2];
        int i=0;
        int j=0;
        int idx=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                ans[idx][0]=nums1[i][0];
                ans[idx][1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
            }else if(nums1[i][0]<nums2[j][0]){
                ans[idx]=nums1[i];
                i++;
            }else{
                ans[idx]=nums2[j];
                j++;
            }
            idx++;
        }
        while(i<nums1.length){
            ans[idx++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[idx++]=nums2[j++];
        }
        return Arrays.copyOf(ans, idx);
    }
}