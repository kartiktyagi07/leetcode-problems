class Solution {
    public String longestPalindrome(String s) {
        // // Brute Force : Find all substrings hen select your answer. It'll give TLE

        // List<String> list = new ArrayList<>();
        // for(int i=0;i<s.length();i++){
        //     for(int j=i+1;j<=s.length();j++){
        //         list.add(s.substring(i,j));
        //     }
        // }
        // list.sort((s1,s2)-> Integer.compare(s1.length(),s2.length()));
        // for(int i=list.size()-1;i>=0;i--){
        //     if(isPalindrome(list.get(i))){
        //         return list.get(i);
        //     }
        // }
        // return "";

        // Optimized Approach : Ek character pakdo and uske left and right ko expand
        // karo jbtk palindrome ban rha h then comapre with answer

        if(s.length() <= 1) return s;
        String ans = "";
        for(int i=1;i<s.length();i++){
            // For Odd Length
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }
            String palindrome = s.substring(low+1,high);
            if(palindrome.length() > ans.length()){
                ans = palindrome;
            }

            // For Even length
            low = i - 1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }
            palindrome = s.substring(low+1,high);
            if(palindrome.length() > ans.length()){
                ans = palindrome;
            }
        }
        return ans;
    }
    public boolean isPalindrome(String str){
        if(str.isEmpty()) return false;
        if(str.length() == 1) return true;
        int s = 0;
        int e = str.length() - 1;
        while(s <= e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}