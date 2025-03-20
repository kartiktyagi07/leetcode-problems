class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force Approach TC:O(N^2) SC:O(1)

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        // Method 2 Using Map Approach TC:O() SC:O() 
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                return new int[]{i,map.get(req)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}