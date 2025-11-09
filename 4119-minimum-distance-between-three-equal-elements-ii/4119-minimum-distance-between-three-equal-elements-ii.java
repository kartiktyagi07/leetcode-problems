class Solution {
    public int minimumDistance(int[] nums) {
        // TLE

        // int n = nums.length;
        // Map<Integer, List<Integer>> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        // }
        // int ans = Integer.MAX_VALUE;
        // for (List<Integer> temp : map.values()) {
        //     if (temp.size() >= 3) {
        //         for (int i = 0; i < temp.size(); i++) {
        //             for (int j = i + 1; j < temp.size(); j++) {
        //                 for (int k = j + 1; k < temp.size(); k++) {
        //                     int a = temp.get(i), b = temp.get(j), c = temp.get(k);
        //                     int distance = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
        //                     ans = Math.min(ans, distance);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return ans == Integer.MAX_VALUE ? -1 : ans;

        // Optimized Approach
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for (List<Integer> temp : map.values()) {
            if (temp.size() >= 3) {
                for(int i=0;i+2<temp.size();i++){
                    int left = temp.get(i);
                    int right = temp.get(i+2);
                    int distance = 2 * (right - left);
                    ans = Math.min(ans,distance);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}