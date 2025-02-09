class Solution {
    public long countBadPairs(int[] nums) {
        long ans=0;
        long n=nums.length;
        HashMap<Long, Long> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long key = (long) nums[i]-i;
            ans += freqMap.getOrDefault(key, 0L);
            freqMap.put(key, freqMap.getOrDefault(key, 0L) + 1);
        }
        long total=(long)(n*(n-1))/2;
        return total-ans;
    }
}