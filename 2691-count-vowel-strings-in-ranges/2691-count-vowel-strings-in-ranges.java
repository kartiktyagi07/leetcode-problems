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
        int q=queries.length;
        int[] ans=new int[q];
        int n=words.length;
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        boolean[] vowel=new boolean[n];
        for(int i=0;i<n;i++){
            char first=words[i].charAt(0);
            char last=words[i].charAt(words[i].length()-1);
            vowel[i]=list.contains(first) && list.contains(last); 
        }
        int[] prefixSum=new int[n];
        prefixSum[0]=vowel[0]?1:0;
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1] + (vowel[i]?1:0);
        }
        for(int i=0;i<q;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            if(start==0){
                ans[i]=prefixSum[end];
            }else{
                ans[i]=prefixSum[end]-prefixSum[start-1];
            }
        }
        return ans;
    } 

}