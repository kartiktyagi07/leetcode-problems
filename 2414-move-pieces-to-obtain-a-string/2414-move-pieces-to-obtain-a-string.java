class Solution {
    public boolean canChange(String start, String target) {
        int n=start.length();
        int i=0;
        int j=0;
        while(i<n || j<n){
            while(i<n && start.charAt(i)=='_') i++;
            while(j<n && target.charAt(j)=='_') j++;
            if(i==n && j==n) return true;
            if(i==n || j==n) return false;
            char sc = start.charAt(i);
            char tc = target.charAt(j);
            if(sc!=tc) return false;
            if(sc=='L' && j>i) return false;
            if(tc=='R' && i>j) return false;
            i++;
            j++;
        }
        return true;
    }
}