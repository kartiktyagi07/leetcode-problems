class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length);
        return nums;
    }
    public void merge(int[] nums,int s,int e){
        if(e-s <= 1) return;
        int mid = (e+s)/2;
        merge(nums,s,mid);
        merge(nums,mid,e);
        mixArr(nums,s,mid,e);
    }
    public void mixArr(int[] nums,int s,int m,int e){
        int[] ans = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(nums[i] <= nums[j]){
                ans[k] = nums[i];
                i++;
            }else{
                ans[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i<m){
            ans[k] = nums[i];
            i++;
            k++;
        }
        while(j<e){
            ans[k] = nums[j];
            j++;
            k++;
        }
        for(int x=0;x<ans.length;x++){
            nums[s+x] = ans[x];
        }
    }
}