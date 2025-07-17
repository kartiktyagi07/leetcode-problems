class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] ans=new int[m+n];
        int i=0;
        int j=0;
        int idx=0;
        double median=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[idx++]=nums1[i++];
            }else{
                ans[idx++]=nums2[j++];
            }
        }
        while(i<m){
            ans[idx++]=nums1[i++];
        }
        while(j<n){
            ans[idx++]=nums2[j++];
        }
        int len=m+n;
        if(len%2==0){
            median=(double)(ans[len/2]+ans[(len/2)-1])/2;
        }else{
            median=(double)ans[len/2];
        }
        return median;
    }
}