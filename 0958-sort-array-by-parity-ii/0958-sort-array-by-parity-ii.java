class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // With using extra space TC:O(N) SC:O(N)

        // ArrayList<Integer> elist=new ArrayList<>();
        // ArrayList<Integer> olist=new ArrayList<>();
        // for(int x:nums){
        //     if(x%2==0){
        //         elist.add(x);
        //     }else{
        //         olist.add(x);
        //     }
        // }
        // int idx1=0;
        // int idx2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i%2==0){
        //         nums[i]=elist.get(idx1++);
        //     }else{
        //         nums[i]=olist.get(idx2++);
        //     }
        // }
        // return nums;


        // Method 2 TC:O(N) SC:O(1)
        
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]%2==0){
                i+=2;
            }else if(nums[j]%2==1){
                j+=2;
            }else{
                swap(nums,i,j);
                i+=2;
                j+=2;
            }
        }
        return nums;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}