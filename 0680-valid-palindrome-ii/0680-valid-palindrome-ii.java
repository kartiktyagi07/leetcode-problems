class Solution {
    public boolean validPalindrome(String s) {
        // Edge case check
        if(s.length()<=2){
            return true;
        }
        // Set two pointers to traverse the string
        int i=0;
        int j=s.length()-1;
        while(i<j){
            // If the character is mismatched to mtlb ek delete krna pdega
            // and uske baad dobara palindrome check krna hoga
            if(s.charAt(i)!=s.charAt(j)){
                // there are 2 possibilities 1-> include i and exclude j
                // 2-> include j and exclude i
                return check(s,i+1,j) || check(s,i,j-1);
            }else{
                // agr mismatched nhi hua to move yout pointers
                i++;
                j--;
            }
        }
        return true;
    }
    public static boolean check(String str,int s,int e){
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }else{
                s++;
                e--;
            }
        }
        return true;
    }
}