class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Approach 1 using set
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        return set.size()!=nums.length;
    }
}