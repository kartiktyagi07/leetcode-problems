    // METHOD 1 MY APPROACH GIVING TLE FOR LARGER CASES TC-O(M*N)

// class Solution {
//     public String shiftingLetters(String s, int[][] shifts) {
//         StringBuilder sb=new StringBuilder(s);
//         for(int i=0;i<shifts.length;i++){
//             int si=shifts[i][0];
//             int ei=shifts[i][1];
//             int dir=shifts[i][2];
//             if(dir==1){
//                 sb=helper(sb,si,ei,true);
//             }else{
//                 sb=helper(sb,si,ei,false);
//             }
//         }
//         return sb.toString();
//     }
//     public static StringBuilder helper(StringBuilder sb, int si, int ei, boolean flag){
//         for(int i=si;i<=ei;i++){
//             char ch=sb.charAt(i);
//             if(flag){
//                 sb.setCharAt(i,(char)((ch - 'a' + 1) % 26 + 'a'));
//             }else{
//                 sb.setCharAt(i,(char)((ch - 'a' + 25) % 26 + 'a'));
//             }
//         }
//         return sb;
//     }
// }

   // METHOD 2 EFFICIENT APPROACH TC-O(M+N)

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftDifference = new int[n + 1];
        for (int[] shift : shifts) {
            int si = shift[0];
            int ei = shift[1];
            int dir = shift[2];
            int change = dir == 1 ? 1 : -1;
            shiftDifference[si] += change;
            if (ei + 1 < n) {
                shiftDifference[ei + 1] -= change;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        int cumulativeShift = 0;
        for (int i = 0; i < n; i++) {
            cumulativeShift += shiftDifference[i];
            char ch = sb.charAt(i);
            int newChar = (ch - 'a' + cumulativeShift) % 26;
            if (newChar < 0) {
                newChar += 26;
            }
            sb.setCharAt(i, (char) ('a' + newChar));
        }
        return sb.toString();
    }
}


