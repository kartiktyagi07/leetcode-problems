    // APPROACH 1 BRUTE APPROACH NOT MEMORY EFFICIENT
// class Solution {
//     public int countPalindromicSubsequence(String s) {
//         int cnt=0;
//         ArrayList<String> res=gss(s);
//         HashSet<String> set=new HashSet<String>();
//         for(int i=0;i<res.size();i++){
//             set.add(res.get(i));
//         }
//         for(String x:set){
//             if(x.length()==3 && palin(x)){
//                 cnt++;
//             }
//         }
//         return cnt;
//     }
//     public static ArrayList<String> gss(String s){
//         if(s.length()==0){
//             ArrayList<String> list=new ArrayList<>();
//             list.add("");
//             return list;
//         }
//         char ch=s.charAt(0);
//         String ros=s.substring(1);
//         ArrayList<String> rres=gss(ros);
//         ArrayList<String> mres=new ArrayList<>();
//         for(String str:rres){
//             mres.add("" + str);
//         }
//         for(String str:rres){
//             mres.add(ch + str);
//         }
//         return mres;
//     }
//     public static boolean palin(String st){
//         int i=0;
//         int j=st.length()-1;
//         while(i<=j){
//             if(st.charAt(i)!=st.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;

//     }
// }
import java.util.Arrays;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int cnt = 0;
        int[] left = new int[26];
        int[] right = new int[26];
        int[] arr = new int[26];

        Arrays.fill(left, Integer.MAX_VALUE);
        Arrays.fill(right, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            left[idx] = Math.min(left[idx], i);
            right[idx] = Math.max(right[idx], i);
            arr[idx]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) continue;
            int cntChk = 0;
            int[] arrChar = new int[26];

            for (int j = left[i] + 1; j < right[i]; j++) {
                int idx = s.charAt(j) - 'a';
                if (arrChar[idx] == 1 || i == idx) continue;
                if (cntChk == 25) break;
                arrChar[idx] = 1;
                cntChk++;
            }
            cnt += cntChk;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 3) cnt++;
        }

        return cnt;
    }
}

