class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indegree[] = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adjList.add(new ArrayList<>());
        for(int arr[]:prerequisites){
            indegree[arr[1]]++;
            adjList.get(arr[0]).add(arr[1]);
        }
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for(int adjacent:adjList.get(node)){
                indegree[adjacent]--;
                if(indegree[adjacent] == 0)
                    queue.add(adjacent);
            }
        }
        // for(int i=0;i<numCourses;i++)
        //   System.out.print(indegree[i]+" ");
        return numCourses == result.size();
    }
}