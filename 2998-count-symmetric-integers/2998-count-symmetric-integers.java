class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        while (low <= high) {
            int dig = (int) (Math.log10(low) + 1);
            if (dig % 2 != 0) {
                low++;
                continue;
            }
            String str = String.valueOf(low);
            int half = str.length() / 2;
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < half; i++) {
                sum1 += str.charAt(i) - '0';
                sum2 += str.charAt(i + half) - '0';
            }
            if (sum1 == sum2)
                cnt++;
            low++;
        }
        return cnt;
    }
}