class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        // Brute Force TLE
        // Calculate each subarray, check conditiona and increase count and return count

        // int cnt = 0;
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         List<Integer> list = new ArrayList<>();
        //         for(int k=i;k<=j;k++){
        //             list.add(nums[k]);
        //         }
        //         if(helper(list,target)){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        // Optimized Approach
        int cnt = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int targetCount = 0;
            for(int j=i;j<n;j++){
                if(nums[j] == target) targetCount++;
                int len = j - i + 1;
                if(2*targetCount>len) cnt++;
            }
        }
        return cnt;
    }
    public boolean helper(List<Integer> list,int target){
        int count = 0;
        for(int i:list){
            if(i == target) count++;
        }
        return 2*count > list.size();
    }
}