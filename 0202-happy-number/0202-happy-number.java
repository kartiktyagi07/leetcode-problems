class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=helper(n);
        }
        return n==1;
    }
    public int helper(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
}