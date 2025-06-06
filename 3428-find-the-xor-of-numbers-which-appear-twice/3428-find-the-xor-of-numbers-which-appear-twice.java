class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val==2){
                ans^=entry.getKey();
            }
        }
        return ans;
    }
}