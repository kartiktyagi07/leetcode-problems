import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        // Brute Force
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger ans=a.multiply(b);
        String sb=ans.toString();
        return sb;
    }
}