class Solution {
    public int maxSumDivThree(int[] nums) {
        int totalSum = 0;
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        for(int i : nums){
            totalSum += i;
            if(i%3 == 1){
                r1.add(i);
            }else if(i%3 == 2){
                r2.add(i);
            }
        }
        if(totalSum % 3 == 0) return totalSum;
        Collections.sort(r1);
        Collections.sort(r2);
        int ans = 0;
        int rem = totalSum % 3;
        if(rem == 1){
            int opt1 = r1.size() >= 1 ? totalSum - r1.get(0) : 0;
            int opt2 = r2.size() >= 2 ? totalSum - r2.get(0) - r2.get(1) : 0;
            ans = Math.max(opt1,opt2);
        }else{
            int opt1 = r2.size() >= 1 ? totalSum - r2.get(0) : 0;
            int opt2 = r1.size() >= 2 ? totalSum - r1.get(0) - r1.get(1) : 0;
            ans = Math.max(opt1,opt2);
        }
        return ans;
    }
}