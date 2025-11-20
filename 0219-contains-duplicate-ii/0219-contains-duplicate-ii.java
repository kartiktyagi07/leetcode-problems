class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Brute Force 
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<=i+k && j<n;j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // Optimized Soluton
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int idx = map.get(nums[i]);
                if(Math.abs(i-idx) <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}