class Solution {
    public int subarraySum(int[] arr, int k) {
        // Optimized Code
        int cnt = 0,sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(map.containsKey(sum - k)){
                cnt += map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;


        // // Brute Force
        // int cnt = 0;
        // int n = arr.length;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         if(sum == k){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;
    }
}