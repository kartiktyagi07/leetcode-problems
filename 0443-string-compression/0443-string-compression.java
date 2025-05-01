class Solution {
    public int compress(char[] chars) {
        // Make a stringbuilder to append the compressed string
        // TC:O(N) SC:O(N)
        
        StringBuilder sb=new StringBuilder();
        int n=chars.length;
        int i=0;
        while(i<n){
            sb.append(chars[i]);
            int cnt=1;
            while(i+1<n && chars[i]==chars[i+1]){
                i++;
                cnt++;
            }
            i++;
            if(cnt==1){
                continue;
            }else{
                sb.append(cnt);
            }
        }
        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();
    }
}