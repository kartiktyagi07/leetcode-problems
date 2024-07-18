class Solution {
    public int findDuplicate(int[] nums) {
        // find maximum to apply counting sort
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        // make the count array
        int[] count=new int[max+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        // sort the given array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
        // finding the repeated element
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    
}