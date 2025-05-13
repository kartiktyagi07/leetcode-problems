class Solution {
    public int lengthAfterTransformations(String s, int t) {
        // Brute Force gives TLE

        // int mod = 1000000007;
        // StringBuilder sb = new StringBuilder(s);
        // while (t-- > 0) {
        //     sb = func(sb);
        // }
        // return sb.length()%mod;

        // Optimized Code Using Frequency array
        // TC:O(N+T) SC:O(1)

        int mod = 1000000007;
        long[] freq = new long[26];
        // Calculating the frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        // T times tk loop chalaya
        for (int j = 0; j < t; j++) {
            // Current iteration ki frequency k liye new array bnaya
            long[] arr = new long[26];
            // a->z i.e 1 to 25
            for (int i = 0; i < 26; i++) {
                // Special case for z. if z h to a and b dono ki
                // frequency badhegi
                if (i == 25) {
                    arr[0] = (arr[0] + freq[25]) % mod;
                    arr[1] = (arr[1] + freq[25]) % mod;
                } else {
                    // as 'a'->'b' so i+1 wale ki frequency badhegi
                    arr[i + 1] = (arr[i + 1] + freq[i]) % mod;
                }
            }
            // Updating the frequency array
            freq = arr;
        }
        long ans = 0;
        for (long i : freq) {
            ans = (ans + i) % mod;
        }
        return (int) ans;
    }

    // public static StringBuilder func(StringBuilder sb) {
    //     StringBuilder res=new StringBuilder();
    //     for (int i=0;i<sb.length();i++) {
    //         char ch=sb.charAt(i);
    //         if (ch == 'z') {
    //             res.append("ab");
    //         }else{
    //             res.append((char)(ch + 1));
    //         }

    //     }
    //     return res;
    // }
}