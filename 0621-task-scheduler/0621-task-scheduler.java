class Solution {
    public int leastInterval(char[] tasks, int n) {
        int m = tasks.length;
        int noOfIntervals = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);
        queue.addAll(map.values());
        while(!queue.isEmpty()){
            List<Integer> dummy = new ArrayList<>();
            int size = queue.size();
            while(!queue.isEmpty()){
                int val = queue.poll();
                val--;
                if(val > 0){
                    dummy.add(val);
                }
            }
            queue.addAll(dummy);
            noOfIntervals += queue.isEmpty()?size:n+1;
        }
        return Math.max(m, noOfIntervals);
    }
}