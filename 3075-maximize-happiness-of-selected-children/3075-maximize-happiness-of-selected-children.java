class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y)-> y-x);
        long answer = 0;
        for(int happy:happiness){
            maxHeap.add(happy);
        }
        int happy = 0;
        while(k-- > 0){
            answer += Math.max(0,maxHeap.poll() - happy);
            happy++;
        }
        return answer;
    }
}