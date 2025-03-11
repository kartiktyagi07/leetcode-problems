class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // With using extra space
        ArrayList<Integer> elist=new ArrayList<>();
        ArrayList<Integer> olist=new ArrayList<>();
        for(int x:nums){
            if(x%2==0){
                elist.add(x);
            }else{
                olist.add(x);
            }
        }
        int idx1=0;
        int idx2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=elist.get(idx1++);
            }else{
                nums[i]=olist.get(idx2++);
            }
        }
        return nums;
    }
}