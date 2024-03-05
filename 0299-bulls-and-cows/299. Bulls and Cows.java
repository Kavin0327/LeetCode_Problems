class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int freq_secret[] = new int[10];
        int freq_guess[] = new int[10];
        int n = secret.length();
        for(int i=0;i<n;i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }  
            else{
                freq_secret[secret.charAt(i)-'0']++;
                freq_guess[guess.charAt(i)-'0']++;     
            }
        }
        for(int i=0;i<10;i++){
            if(freq_secret[i] != 0 && freq_guess[i] != 0)
                cows += Math.min(freq_secret[i],freq_guess[i]);
        }
        // return bulls+"A"+cows+"B"; // because time complexity is high compare to StringBuilder
        StringBuilder answer = new StringBuilder();
        answer.append(bulls);
        answer.append("A");
        answer.append(cows);
        answer.append("B");
        return answer.toString();
    }
}
