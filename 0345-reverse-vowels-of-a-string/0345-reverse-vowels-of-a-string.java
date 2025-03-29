class Solution {
    public String reverseVowels(String s) {
        // TC:O(N) SC:O(N)
        // ArrayList<Character> list=new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        // int i=0;
        // int j=s.length()-1;
        // StringBuilder sb=new StringBuilder(s);
        // while(i<j){
        //     if(list.contains(sb.charAt(i)) && list.contains(sb.charAt(j))){
        //        char temp=sb.charAt(i);
        //        sb.setCharAt(i,sb.charAt(j));
        //        sb.setCharAt(j,temp);
        //        i++;
        //        j--;
        //     }else if(!list.contains(sb.charAt(i))){
        //         i++;
        //     }else if(!list.contains(sb.charAt(j))){
        //         j--;
        //     }
        // }
        // return sb.toString();




        Set<Character> set=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            if(set.contains(arr[i]) && set.contains(arr[j])){
                swap(arr,i,j);
                i++;
                j--;
            }else if(!set.contains(arr[i])){
                i++;
            }else{
                j--;
            }
        }
        return new String(arr);
    }
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}