class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }else{
                secretCount[secret.charAt(i)- '0']++;
                guessCount[guess.charAt(i) - '0']++;
            }
        }
        for(int j=0;j<10;j++){
            cows += Math.min(secretCount[j],guessCount[j]);
        }
        return bulls + "A" + cows + "B";
    }
}