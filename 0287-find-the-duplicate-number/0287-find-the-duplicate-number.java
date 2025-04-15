class Solution {
    public int findDuplicate(int[] nums) {
        // // find maximum to apply counting sort
        // int max=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>max){
        //         max=nums[i];
        //     }
        // }
        // // make the count array
        // int[] count=new int[max+1];
        // for(int i=0;i<nums.length;i++){
        //     count[nums[i]]++;
        // }
        // // sort the given array
        // int j=0;
        // for(int i=0;i<count.length;i++){
        //     while(count[i]>0){
        //         nums[j]=i;
        //         j++;
        //         count[i]--;
        //     }
        // }
        // // finding the repeated element
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;





        // Method 2 using cyclic sort
        // Applying Cycle sort to sort the array
        int n=nums.length;
        int idx=0;
        while(idx<n){
            int ele=nums[idx];
            int pos=ele-1;
            if(nums[idx]<n && nums[idx]!=nums[pos]){
                swap(nums,idx,pos);
            }else{
                idx++;
            }
        }
        // find the repeated number
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        return;
    }
    
}