class Solution {
    public void sortColors(int[] arr) {
        // int cnt0=0;
        // int cnt1=0;
        // int cnt2=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         cnt0++;
        //     }else if(arr[i]==1){
        //         cnt1++;
        //     }else{
        //         cnt2++;
        //     }
        // }
        // for(int idx=0;idx<cnt0;idx++){
        //     arr[idx]=0;
        // }
        // for(int idx=cnt0;idx<cnt0+cnt1;idx++){
        //     arr[idx]=1;
        // }
        // for(int idx=cnt0+cnt1;idx<cnt0+cnt1+cnt2;idx++){
        //     arr[idx]=2;
        // }


        int s=0;
        int e=arr.length-1;
        int m=0;
        while(m<=e){
            if(arr[m]==0){
                swap(arr,s,m);
                s++;
                m++;
            }else if(arr[m]==1){
                m++;
            }else{
                swap(arr,m,e);
                e--;
            }
        }
    }
    public static void swap(int[] arr,int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}