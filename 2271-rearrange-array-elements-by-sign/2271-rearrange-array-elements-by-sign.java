class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Method 1 TC:O(N) SC:O(N)
        // Creates 2 lists pos,neg and then modify the nums

        // LinkedList<Integer> pos = new LinkedList<>();
        // LinkedList<Integer> neg = new LinkedList<>();
        // for(int x:nums){
        //     if(x>0){
        //         pos.add(x);
        //     }else{
        //         neg.add(x);
        //     }
        // }
        // boolean flag=true;
        // for(int i=0;i<nums.length;i++){
        //     if(flag){
        //         nums[i]=pos.poll();
        //     }else{
        //         nums[i]=neg.poll();
        //     }
        //     flag=!flag;
        // }
        // return nums;



        // Method 2 Two Pointer Approach TC:O(N) SC:O(1)
        int[] ans=new int[nums.length];
        int p=0;
        int n=1;
        for(int x:nums){
            if(x>0){
                ans[p]=x;
                p+=2;
            }else{
                ans[n]=x;
                n+=2;
            }
        }
        return ans;
    }
}