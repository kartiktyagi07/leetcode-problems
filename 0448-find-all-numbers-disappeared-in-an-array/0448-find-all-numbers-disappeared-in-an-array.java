class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // TC:O(N) SC:O(1)
        
        // ArrayList<Integer> ans = new ArrayList<>();
        // int i = 0;
        // while (i < nums.length) {
        //     int c = nums[i] - 1;
        //     if (nums[i] != nums[c]) {
        //         int temp = nums[i];
        //         nums[i] = nums[c];
        //         nums[c] = temp;
        //     } else {
        //         i++;
        //     }
        // }
        // for (int k = 0; k < nums.length; k++) {
        //     if (nums[k] != k + 1) {
        //         ans.add(k + 1);
        //     }
        // }
        // return ans;



        // Approach 2
        // Make a set, add all elements in the set then again iterate over
        // array and check if the nums[i] does not in set the add it in answer
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<nums.length+1;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}