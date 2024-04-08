class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        int n = students.length;
        for(int i=0;i<n;i++){
            queue.offer(students[i]);
        }
        int leaveCount = 0;
        int i = 0;
        while(!queue.isEmpty() && leaveCount < queue.size()){
            if(queue.peek() == sandwiches[i]){
                queue.poll();
                i++;
                leaveCount = 0;
            }
            else{
                queue.offer(queue.poll());
                leaveCount++;
            }
        }
        return queue.size();
    }
}