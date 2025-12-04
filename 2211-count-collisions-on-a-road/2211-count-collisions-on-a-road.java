class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        if(n == 1) return 0;
        int left = 0 , right = n - 1;
        while(left < n && directions.charAt(left) == 'L'){
            left++;
        }
        while(right > 0 && directions.charAt(right) == 'R'){
            right--;
        }
        int cnt = 0;
        for(int i=left;i<=right;i++){
            if(directions.charAt(i) != 'S'){
                cnt++;
            }
        }
        return cnt;
    }
}