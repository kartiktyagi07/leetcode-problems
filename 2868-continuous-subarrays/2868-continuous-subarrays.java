import java.util.*;

class Solution {
    public long continuousSubarrays(int[] nums) {
        long cnt = 0;
        int left = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int right = 0; right < nums.length; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);
            
            while (getMax(freqMap) - getMin(freqMap) > 2) {
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }
            
            cnt += (right - left + 1);
        }
        
        return cnt;
    }

    private int getMax(Map<Integer, Integer> freqMap) {
        return Collections.max(freqMap.keySet());
    }

    private int getMin(Map<Integer, Integer> freqMap) {
        return Collections.min(freqMap.keySet());
    }
}
