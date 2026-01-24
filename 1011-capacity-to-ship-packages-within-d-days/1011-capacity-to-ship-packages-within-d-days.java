class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int ans = 0;
        int low = 0;
        for(int i:weights){
            low = Math.max(i,low);
        }
        int sum = 0;
        for(int i:weights){
            sum += i;
        }
        int high = sum;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(weights,days,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] weights,int days,int maxCapacity){
        int capacity = 0;
        int noOfDays = 1;
        for(int i:weights){
            if(capacity + i <= maxCapacity){
                capacity += i;
            }else{
                noOfDays++;
                capacity = i;
            }
        }
        return noOfDays <= days;
    }
}