class Solution {
    public int subarraySum(int[] arr, int k) {
        // Brute Force
        int cnt = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}