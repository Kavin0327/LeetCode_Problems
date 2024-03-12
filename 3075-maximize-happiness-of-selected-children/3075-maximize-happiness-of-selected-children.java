class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y)-> y-x);
        long answer = 0;
        // for(int happy:happiness){
        //     maxHeap.add(happy);
        // }
        Arrays.sort(happiness);
        int happy = 0;
        int n = happiness.length;
        int i = n-1;
        while(happy < k){
            answer += Math.max(0,(happiness[i] - happy));
            happy++;
            i--;
        }
        return answer;
    }
}