class Solution {
    public int longestConsecutive(int[] nums) {
        // Brute force Approach using sorting of array TC:O(NLOGN)

        // if(nums.length==0) return 0;
        // Arrays.sort(nums);
        // int cnt=1;
        // int temp=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]) continue;
        //     if(nums[i]==nums[i-1]+1) cnt++;
        //     else{
        //         temp=Math.max(temp,cnt);
        //         cnt=1;
        //     }
        // }
        // temp=Math.max(temp,cnt);
        // return temp;

        // Optimized Approach TC:O(logN)
        if (nums.length == 0)
            return 0;
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for(int num:set){
            if(set.contains(num-1)) continue;
            int cnt = 1;
            int curr = num;
            while (set.contains(curr + 1)) {
                cnt++;
                curr++;
            }
            ans = Math.max(cnt, ans);
        }
        return ans;
    }
}