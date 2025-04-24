class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // Brute Force  TC:O(N^3) SC:O(N^3) it gives TLE

        // int n=nums.length;
        // Set<Integer> set=new HashSet<>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // int sum=0;
        // for(int i:set){
        //     sum+=i;
        // }
        // List<List<Integer>> list=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         List<Integer> temp=new ArrayList<>();
        //         for(int k=i;k<=j;k++){
        //             temp.add(nums[k]);
        //         }
        //         list.add(temp);
        //     }
        // }
        // int cnt=0;
        // for(List<Integer> temp:list){
        //     if(temp.size()<set.size()){
        //         continue;
        //     }else{
        //         int currSum=func(temp);
        //         if(currSum==sum) cnt++;
        //     }
        // }
        // return cnt;


        // We only need to caalculate the subarrays with distinct
        // elements so we need to generate all
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int distinct=set.size();
        int cnt=0;
        for(int i=0;i<n;i++){
            Set<Integer> seen=new HashSet<>();
            for(int j=i;j<n;j++){
                seen.add(nums[j]);
                if(seen.size()==distinct){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    // public static int func(List<Integer> temp){
    //     Set<Integer> tempSet=new HashSet<>();
    //     for(int i:temp){
    //         tempSet.add(i);
    //     }
    //     int sum=0;
    //     for(int i:tempSet){
    //         sum+=i;
    //     }
    //     return sum;
    // }
}