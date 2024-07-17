class Solution {
    public void nextPermutation(int[] arr) {
        int idx=-1;
        // finding the breaking point
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        // checking if we have a breaking point or not
        if(idx==-1){
            arrange(arr,0,arr.length-1);
            return;
        }
        // finding the samllest from right side of break point to perform swapping
        for(int j=arr.length-1;j>=idx;j--){
            if(arr[j]>arr[idx]){
                swap(arr,idx,j);
                break;
            }
        }
        // arrange the right portion in minimum possible order
        arrange(arr,idx+1,arr.length-1);
    }
    // function to performing swapping
    public void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    // function to arrange 
    public void arrange(int[] arr,int start,int end){
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}