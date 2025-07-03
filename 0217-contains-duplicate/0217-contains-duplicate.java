class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Method 1 Using Set

        // Set<Integer> set=new HashSet<>();
        // for(int x:nums){
        //     set.add(x);
        // }
        // return set.size()!=nums.length;


        // Using Map
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int value:map.values()){
            if(value>1){
                return true;
            }
        }
        return false;
    }
}