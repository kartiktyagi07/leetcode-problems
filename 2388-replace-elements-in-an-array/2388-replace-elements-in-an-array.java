class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        // Brute Force will give TLE

        // for (int i = 0; i < operations.length; i++) {
        //     int key = operations[i][0];
        //     int value = operations[i][1];
        //     searchAndReplace(nums, key, value);
        // }
        // return nums;

        //  Efficient approach using Maps
        // Creating an value to idx map
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<operations.length;i++){
            int key=operations[i][0];
            int value=operations[i][1];
            int idx=map.get(key);
            nums[idx]=value;
            map.remove(key);
            map.put(value,idx);
        }
        return nums;
    }

    // public static void searchAndReplace(int[] nums, int key, int value) {
    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i]==key){
    //             nums[i]=value;
    //             return;
    //         }
    //     }
    // }
}