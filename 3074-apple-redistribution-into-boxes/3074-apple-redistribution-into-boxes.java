class Solution {
    public int minimumBoxes(int[] apples, int[] capacity) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((x,y) -> y-x); // MAX_HEAP
        int minBoxCount = 0;
        int totalApples = 0;
        for(int apple:apples)
            totalApples += apple;    
            
        for(int x:capacity)
            queue.add(x);
        
        while(totalApples > 0){
            totalApples -= queue.poll();
            minBoxCount++;
        }
        return minBoxCount;
    }
}