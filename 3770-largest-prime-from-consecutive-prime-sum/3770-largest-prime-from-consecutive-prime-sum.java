class Solution {
    public int largestPrime(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] isPrime = seive(n);
        int sum = 0;
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                sum += i;
                if(sum>n) break;
                list.add(sum);
            }
        }
        int ans = 0;
        for(int i:list){
            if(i<=n && isPrime[i]){
                ans = i;
            }
        }
        return ans;
    }
    public boolean[] seive(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        if(n >= 1) prime[0] = true;
        if(n >= 2) prime[1] = true;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}