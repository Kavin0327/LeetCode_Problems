class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int n = colors.length();
        int prev = 0;
        for(int i=1;i<n;i++){
            if(colors.charAt(prev) == colors.charAt(i)){
                totalTime += Math.min(neededTime[prev],neededTime[i]);
                if(neededTime[prev] < neededTime[i])
                    prev = i;
            }
            else{
                prev = i;
            }
        }
        return totalTime;
    }
}