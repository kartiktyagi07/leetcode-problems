class Solution {
    public int longestMountain(int[] arr) {
        // Two Pinter Approach TC:O(N) SC:O(1)  

        // int n=arr.length;
        // if(n<3) return 0;
        // int ans=0;
        // for(int i=1;i<n-1;i++){
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
        //         int  l=i-1;
        //         int r=i+1;
        //         while(l>0 && arr[l]>arr[l-1]){
        //             l--;
        //         }
        //         while(r<n-1 && arr[r]>arr[r+1]){
        //             r++;
        //         }
        //         ans=Math.max(ans,r-l+1);
        //     }
        // }
        // return ans;


        // Using Prefix Sum Approach

        int n=arr.length;
        int[] leftInc=new int[n];
        int[] rightInc=new int[n];
        // Compute the leftInc array
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                leftInc[i]=leftInc[i-1]+1;
            }
        }
        // Compute the rightInc array
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                rightInc[i]=rightInc[i+1]+1;
            }
        }
        // Computing the final result
        int ans=0;
        for(int i=1;i<n-1;i++){
            if(leftInc[i]>0 && rightInc[i]>0){
                int val=leftInc[i]+rightInc[i]+1;
                ans=Math.max(ans,val);
            }
        }
        return ans;
    }
}