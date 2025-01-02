class Solution {
        // IT IS CORRECT BUT IT IS GIVING TLE 92/93 ARE PASSED

    // public int[] vowelStrings(String[] words, int[][] queries) {
    //     int[] ans=new int[queries.length];
    //     ArrayList<Character> list=new ArrayList<>();
    //     list.add('a');
    //     list.add('e');
    //     list.add('i');
    //     list.add('o');
    //     list.add('u');
    //     for(int i=0;i<queries.length;i++){
    //         int startIdx=queries[i][0];
    //         int endIdx=queries[i][1];
    //         int cnt=0;
    //         for(int j=startIdx;j<=endIdx;j++){
    //             String str=words[j];
    //             if(check(str,list)){
    //                 cnt++;
    //             }
    //         }
    //         ans[i]=cnt;
    //     }
    //     return ans;
    // }
    // public static boolean check(String str,ArrayList<Character> list){
    //     char s=str.charAt(0);
    //     char e=str.charAt(str.length()-1);
    //     return (list.contains(s)&& list.contains(e));
    // }




            // METHOD 2 PRE COMPUTE THE RESULT IN A BOOLEAN ARRAY
    public int[] vowelStrings(String[] words, int[][] queries){
        int n=words.length;
        int q=queries.length;
        int[] ans=new int[q];
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        boolean vowels[]=new boolean[n];
        for(int i=0;i<n;i++){
            String str=words[i];
            char s=str.charAt(0);
            char e=str.charAt(str.length()-1);
            vowels[i]=list.contains(s) && list.contains(e);
        }
        int[] prefix=new int[n];
        prefix[0]=vowels[0]?1:0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+(vowels[i]?1:0);
        }
        for(int i=0;i<q;i++){
            int startIdx=queries[i][0];
            int endIdx=queries[i][1];
            if(startIdx==0){
                ans[i]=prefix[endIdx];
            }else{
                ans[i]=prefix[endIdx]-prefix[startIdx-1];
            }
        }
        return ans;
    } 

}