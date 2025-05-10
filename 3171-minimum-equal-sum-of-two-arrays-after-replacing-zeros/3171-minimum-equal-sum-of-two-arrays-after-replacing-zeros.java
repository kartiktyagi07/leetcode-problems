class Solution {
    public long minSum(int[] nums1, int[] nums2) {

        int cnt1=0;
        long sum1=0;
        for(int i:nums1){
            if(i==0) cnt1++;
            else sum1+=i;
        }
        long finalSum1=sum1+cnt1;

        int cnt2=0;
        long sum2=0;
        for(int i:nums2){
            if(i==0) cnt2++;
            else sum2+=i;
        }
        long finalSum2=sum2+cnt2;

        if(finalSum1==finalSum2){
            return finalSum1;
        }
        if((finalSum1<finalSum2 && cnt1==0) || (finalSum2<finalSum1 && cnt2==0)){
            return -1;
        }
        return Math.max(finalSum1,finalSum2);
    }
}