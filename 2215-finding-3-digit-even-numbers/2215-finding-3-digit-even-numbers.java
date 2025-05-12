class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // TC:O(N) SC:O(1)

        ArrayList<Integer> list=new ArrayList<>();
        int[] digitCount=new int[10];
        for(int i=0;i<digits.length;i++){
            digitCount[digits[i]]++;
        }
        for(int i=100;i<=999;i+=2){
            if(check(i,digitCount)){
                list.add(i);
            }
        }
        Collections.sort(list);
        int[] ans=new int[list.size()];
        int idx=0;
        for(int i:list){
            ans[idx++]=i;
        }
        return ans;
    }
    public static boolean check(int n,int[] digitCount){
        int[] digitReq=new int[10];
        while(n!=0){
            int rem=n%10;
            digitReq[rem]++;
            n=n/10;
        }
        for(int i=0;i<10;i++){
            if(digitReq[i]>digitCount[i]){
                return false;
            }
        }
        return true;
    }
}