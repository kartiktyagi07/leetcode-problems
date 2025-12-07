class Solution {
    public int[] sortByReflection(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,reverseBinaryNum(i));
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)->{
                int ra = map.get(a);
                int rb = map.get(b);
                if(ra != rb) return ra - rb;
                return a - b; 
            }
        );
        for(int i : nums){
            pq.offer(i);
        }
        int i = 0;
        int[] ans = new int[n];
        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }
        return ans;
    }
    public int reverseBinaryNum(int n){
        String str = Integer.toBinaryString(n);
        String rev = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(rev,2);
    }
}