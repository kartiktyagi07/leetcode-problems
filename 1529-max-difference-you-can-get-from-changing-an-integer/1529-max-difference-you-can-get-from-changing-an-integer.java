class Solution {
    public int maxDiff(int num) {
        String sb1=new String(String.valueOf(num));
        String sb2=new String(String.valueOf(num));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sb1.length();i++){
            char ch=sb1.charAt(i);
            if(ch!='9'){
                sb1=sb1.replace(ch,'9');
                break;
            }
        }
        for(int i=0;i<sb2.length();i++){
            char ch=sb2.charAt(i);
            if (i == 0) {
                if (ch != '1') {
                    sb2 = sb2.replace(ch, '1');
                    break;
                }
            } else {
                if (ch != '0' && ch!='1') {
                    sb2 = sb2.replace(ch, '0');
                    break;
                }
            }
        }
        return Integer.parseInt(sb1)-Integer.parseInt(sb2);
    }
}