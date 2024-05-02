class Solution {
    public int findMaxK(int[] nums) {
        int answer = -1;
        boolean freq[] = new boolean[2001];
        for(int x:nums){
            if(x > 0){
                freq[x] = true;  
            }
            else{
                int n = -x;
                freq[n+1000] = true;
            }
        }
        for(int i=1000;i>=0;i--){
            if(freq[i] && freq[i+1000]){
                answer = i;
                break;
            }
        }
        return answer;
    }
}