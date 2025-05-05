class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        // Brute Forec Approach
        // TC:O(m*k) m->the number of bookings k-> range from start to end
        int[] ans=new int[n];
        for(int i=0;i<bookings.length;i++){
            int start=bookings[i][0];
            int end=bookings[i][1];
            int val=bookings[i][2];
            for(int j=start;j<=end;j++){
                ans[j-1]+=val;
            }
        }
        return ans;
    }
}