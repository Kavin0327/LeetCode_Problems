class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
       Arrays.sort(tokens);
       int n = tokens.length;
       int left = 0;
       int right = n-1;
       int answer = 0;
       int count = 0;
       while(left <= right){
            if(tokens[left] <= power){
                power -= tokens[left++];
                count++;
                if(answer < count)
                    answer = count;
            }   
            else if(answer > 0){
                power += tokens[right--];
                count--;
            }
           else{
                break; 
           }
       }
       return answer;
    }
}