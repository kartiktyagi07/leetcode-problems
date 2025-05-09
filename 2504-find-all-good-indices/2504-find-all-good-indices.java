class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();

        // Compute the left decreasing array
        int[] left=new int[n];
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                left[i]=left[i-1]+1;
            }
        }

        // Compute the right increasing array
        int[] right=new int[n];
        for(int i=n-2;i>=0;i--){
            if(nums[i]<=nums[i+1]){
                right[i]=right[i+1]+1;
            }
        }

        // Compute the final answer
        for(int j=k;j<=n-k-1;j++){
            if(left[j-1]>=k-1 && right[j+1]>=k-1){
                list.add(j);
            }
        }
        return list;
    }
}