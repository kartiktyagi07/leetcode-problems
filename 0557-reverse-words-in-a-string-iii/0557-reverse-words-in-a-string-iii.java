class Solution {
    public String reverseWords(String s) {
        // Method 1 Brute Force 

        // String[] arr=s.split(" ");
        // ArrayList<String> list=new ArrayList<>();
        // for(String x:arr){
        //     list.add(reverse(x));
        // }
        // return String.join(" ",list);

        // Method 2 using in-built functions
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(new StringBuilder(arr[i]).reverse());
            if(i<arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
    // public static String reverse(String str){
    //     StringBuilder sb=new StringBuilder(str);
    //     int i=0;
    //     int j=sb.length()-1;
    //     while(i<j){
    //         char temp=sb.charAt(i);
    //         sb.setCharAt(i,sb.charAt(j));
    //         sb.setCharAt(j,temp);
    //         i++;
    //         j--;
    //     }
    //     return sb.toString();
    // }
}