class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        // Finding potential answers
        int cand1=0,cand2=0;
        int cnt1=0,cnt2=0;
        for(int i:nums){
            if(i == cand1){
                cnt1++;
            }else if(i == cand2){
                cnt2++;
            }else if(cnt1 == 0){
                cand1 = i;
                cnt1 = 1;
            }else if(cnt2 == 0){
                cand2 = i;
                cnt2 = 1;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        // Veryfying the potential answers
        cnt1 = 0;
        cnt2 = 0;
        for(int i:nums){
            if(i == cand1){
                cnt1++;
            }else if(i == cand2){
                cnt2++;
            }
        }
        // Filling the answers
        if(cnt1 > n/3) list.add(cand1);
        if(cnt2 > n/3) list.add(cand2);
        return list; 
    }
}