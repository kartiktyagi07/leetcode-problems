class Solution {
    public long minimumSteps(String s) {
        // Solution is correct but gives TLE
        
        // long ans = 0;
        // int n = s.length();
        // int cnt = 0;
        // StringBuilder sb = new StringBuilder(s);
        // for (int k = 0; k < n; k++) {
        //     if (sb.charAt(k) == '0') {
        //         cnt++;
        //     }
        // }
        // while (!check(sb, cnt)) {
        //     int i=0;
        //     int j=1;
        //     while (j + 1 <= n) {
        //         char first = sb.charAt(i);
        //         char second = sb.charAt(j);
        //         if (first == '1' && second == '0') {
        //             swap(sb, i, j);
        //             ans++;
        //             i++;
        //             j++;
        //         } else {
        //             i++;
        //             j++;
        //         }
        //     }
        // }
        // return ans;




        long ans = 0;
        int n = s.length();
        int cnt = 0;
        StringBuilder sb = new StringBuilder(s);
        int i=n-1;
        while(i>=0){
            if(s.charAt(i)=='0') cnt++;
            if(s.charAt(i)=='1') ans+=cnt;
            i--;
        }
        return ans;
    }

    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

    public static boolean check(StringBuilder sb, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (sb.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }
}