class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char answer = keysPressed.charAt(0);
        int n = keysPressed.length();
        int duration = releaseTimes[0];
        for(int i=1;i<n;i++){
            int time = (int)Math.abs(releaseTimes[i-1]-releaseTimes[i]);
            if(duration == time){
                if(answer < keysPressed.charAt(i))
                    answer = keysPressed.charAt(i);
            }
            else if(duration < time){
                 answer = keysPressed.charAt(i);
                duration = time;
            }
        }
        return answer;
    }
}