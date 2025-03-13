class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Method 1 
        // Creates 2 lists pos,neg and then modify the nums
        LinkedList<Integer> pos = new LinkedList<>();
        LinkedList<Integer> neg = new LinkedList<>();
        for(int x:nums){
            if(x>0){
                pos.add(x);
            }else{
                neg.add(x);
            }
        }
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(flag){
                nums[i]=pos.poll();
            }else{
                nums[i]=neg.poll();
            }
            flag=!flag;
        }
        return nums;
    }
}