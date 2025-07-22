class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans=0;
        int n=nums.length;
        int left=0;
        int right=0;
        int cs=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            cs+=nums[right];
            while(!map.isEmpty() && map.containsKey(nums[right])){
                if(map.get(nums[left])==1){
                    map.remove(nums[left]);
                }else{
                    map.put(nums[left],map.get(nums[left])-1);
                }
                cs-=nums[left];
                left++;
            }
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            ans=Math.max(ans,cs);
            right++;
        }
        return ans;
    }
}