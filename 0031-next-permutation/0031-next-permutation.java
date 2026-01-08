class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        // Find the pivot/breaking index
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        // Checking if we have a breaking point or not
        if(idx == -1){
            /* That means we dont find a breaking index that means array is 
            already in the greatest possible permutation so simply return minimum possible
            permutation i.e reverse the array */
            reverse(nums,0,n-1);
            return;
        }

        // find the smallest from right side for swapping
        for(int i=n-1;i>=idx;i--){
            if(nums[i] > nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }

        // Arrange the right portion in the smallest possible permutation
        reverse(nums,idx+1,n-1);
    }
    public void swap(int[] nums,int s,int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
    public void reverse(int[] nums,int s,int e){
        while(s <= e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
}