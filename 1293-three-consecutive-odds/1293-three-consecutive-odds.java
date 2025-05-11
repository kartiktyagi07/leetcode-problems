class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // Brute Force

        // int n=arr.length;
        // for(int i=0;i<=n-3;i++){
        //     int cnt=0;
        //     for(int j=i;j<i+3;j++){
        //         if(arr[j]%2!=0){
        //             cnt++;
        //         }else{
        //             break;
        //         }
        //     }
        //     if(cnt==3) return true;
        // }
        // return false;


        // Second way

        // int n=arr.length;
        // for(int i=0;i<=n-3;i++){
        //     for(int j=i;j<i+3;j++){
        //         if(arr[j]%2==0){
        //             break;
        //         }
        //         if(j==i+2) return true;
        //     }
        // }
        // return false;


        // Third way
        int n=arr.length;
        for(int i=0;i<=n-3;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }
}