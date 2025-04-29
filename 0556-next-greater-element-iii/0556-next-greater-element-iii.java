class Solution {
    public int nextGreaterElement(int n) {
        // Convert number into string
        StringBuilder str=new StringBuilder(Integer.toString(n));

        // find breaking point index
        int idx=-1;
        for(int i=str.length()-2;i>=0;i--){
            int val1=str.charAt(i)-'0';
            int val2=str.charAt(i+1)-'0';
            if(val1<val2){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            return -1;
        }
        // find samllest from right side which is bigger than str.charAt(idx)
        int val=str.charAt(idx)-'0';
        for(int i=str.length()-1;i>=idx;i--){
            int curr=str.charAt(i)-'0';
            if(curr>val){
                swap(str,i,idx);
                break;
            }
        }
        // Arrange the right portion as minimum as possible
        int s=idx+1;
        int e=str.length()-1;
        while(s<e){
            swap(str,s,e);
            s++;
            e--;
        }
        // Returning the answer
        long ans=Long.parseLong(str.toString());
        return ans>Integer.MAX_VALUE?-1:(int)ans;
    }
    public static void swap(StringBuilder str,int s,int e){
        char ch=str.charAt(s);
        str.setCharAt(s,str.charAt(e));
        str.setCharAt(e,ch);
        return;
    }
}