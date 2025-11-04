class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int j = i + k -1;
            ans[i] = xSum(nums,x,i,j);
        }
        return ans;
    }
    public int xSum(int[] nums,int x,int i,int j){
        int currSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a = i; a <= j; a++){
            map.put(nums[a],map.getOrDefault(nums[a],0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b)-> {
                if(b.getValue().equals(a.getValue())){
                    return b.getKey() - a.getKey();
                }
                return b.getValue() - a.getValue();
            }
        );
        pq.addAll(map.entrySet());
        int cnt = 0;
        while(!pq.isEmpty() && cnt<x){
            Map.Entry<Integer,Integer> entry = pq.poll();
            currSum += entry.getKey()*entry.getValue();
            cnt++;
        }
        return currSum;
    }
}