class Solution {
    public int reversePairs(int[] nums) {
        // Method 1 TLE
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>(long)nums[j]*2){
        //             ans++;
        //         }
        //     }
        // }
        // return ans;


        // Method 2 using merge sort
        int n=nums.length;
        if(n==0) return 0;
        return mergeSort(nums,0,n-1);
    }
    public static int mergeSort(int[] arr,int low,int high){
        if(low>=high) return 0;
        int mid=(low+high)/2;
        int cnt=mergeSort(arr,low,mid)+mergeSort(arr,mid+1,high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }  
    public static int merge(int[] arr,int low,int mid,int high){
        int cnt=0;
        int k=mid+1;
        for(int a=low;a<=mid;a++){
            while(k<=high && arr[a]>2*(long)arr[k]){
                k++;
            }
            cnt+=(k-mid-1);
        }
        List<Integer> temp=new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp.add(arr[i++]);
            }else{
                temp.add(arr[j++]);
            }
        }
        while(i<=mid){
            temp.add(arr[i++]);
        }
        while(j<=high){
            temp.add(arr[j++]);
        }
        for(int x=low;x<=high;x++){
            arr[x]=temp.get(x-low);
        }
        return cnt;
    }
}