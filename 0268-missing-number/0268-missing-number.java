class Solution {
    public int missingNumber(int[] arr) {
        // Method 1 usig cycle sort

        // int i=0;
        // while(i<arr.length){
        //     int c=arr[i];
        //     if(arr[i]<arr.length && arr[i]!=arr[c]){
        //         int temp=arr[i];
        //         arr[i]=arr[c];
        //         arr[c]=temp;
        //     }else{
        //         i++;
        //     }
        // }
        // for(int k=0;k<arr.length;k++){
        //     if(arr[k]!=k){
        //         return k;
        //     }
        // }
        // return arr.length;


        // Method 2 Using total sum and curr sum
        int n=arr.length;
        int totalSum=(n*(n+1))/2;
        int currSum=0;
        for(int i:arr){
            currSum+=i;
        }
        return totalSum-currSum;
    }
}