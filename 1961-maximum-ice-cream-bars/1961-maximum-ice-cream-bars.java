class Solution {
    public int maxIceCream(int[] arr, int coins) {
        // Normal method but we have to do it using counting sort
        // int n=arr.length;
        // Arrays.sort(arr);
        // int cnt=0;
        // for(int x:arr){
        //     if(coins>=x){
        //         coins-=x;
        //         cnt++;
        //     }else{
        //         break;
        //     }
        // }
        // return cnt;


        // using count sort
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        int[] freq=new int[max+1];
        for(int x:arr){
            freq[x]++;
        }
        int cnt=0;
        for(int i=1;i<max+1;i++){
            if(freq[i]==0){
                continue;
            }
            int buy=Math.min(freq[i],coins/i);
            coins-=buy*i;
            cnt+=buy;
            if(coins<i) break;
        }
        return cnt;
    }
}