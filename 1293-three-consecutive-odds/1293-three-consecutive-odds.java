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
        int n=arr.length;
        for(int i=0;i<=n-3;i++){
            for(int j=i;j<i+3;j++){
                if(arr[j]%2==0){
                    break;
                }
                if(j==i+2) return true;
            }
        }
        return false;
    }
}