class Solution {
    public void reverseString(char[] ss) {
        int s=0;
        int e=ss.length-1;
        while(s<e){
            char temp=ss[s];
            ss[s]=ss[e];
            ss[e]=temp;
            s++;
            e--;
        }

    }
}