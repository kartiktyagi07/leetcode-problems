class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // Using HashMap TC:O(N)
        // int ans=0;
        // int n=nums.length;
        // int left=0;
        // int right=0;
        // int cs=0;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // while(right<n){
        //     cs+=nums[right];
        //     while(!map.isEmpty() && map.containsKey(nums[right])){
        //         if(map.get(nums[left])==1){
        //             map.remove(nums[left]);
        //         }else{
        //             map.put(nums[left],map.get(nums[left])-1);
        //         }
        //         cs-=nums[left];
        //         left++;
        //     }
        //     map.put(nums[right],map.getOrDefault(nums[right],0)+1);
        //     ans=Math.max(ans,cs);
        //     right++;
        // }
        // return ans;

        // Using HashSet
        int ans=0;
        int n=nums.length;
        int left=0;
        int right=0;
        int cs=0;
        HashSet<Integer> set=new HashSet<>();
        while(right<n){
            cs+=nums[right];
            while(!set.isEmpty() && set.contains(nums[right])){
                set.remove(nums[left]);
                cs-=nums[left];
                left++;
            }
            set.add(nums[right]);
            ans=Math.max(ans,cs);
            right++;
        }
        return ans;
    }
}