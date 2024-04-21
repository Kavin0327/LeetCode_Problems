class Solution {
    // BFS 
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Creating Adjacency Matrix
        if(source == destination)
            return true;
        Map<Integer,List<Integer>> adjacencyMatrix = new HashMap<>();
        for(int arr[]:edges){
            if(!adjacencyMatrix.containsKey(arr[0]))
                adjacencyMatrix.put(arr[0],new ArrayList<>());
            if(!adjacencyMatrix.containsKey(arr[1]))
                adjacencyMatrix.put(arr[1],new ArrayList<>());
            adjacencyMatrix.get(arr[0]).add(arr[1]);
            adjacencyMatrix.get(arr[1]).add(arr[0]);
        }
        // System.out.println(adjacencyMatrix);
        boolean visited[] = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                int curr = queue.poll();
                if(curr == destination)
                    return true;
                for(int edge:adjacencyMatrix.get(curr)){
                    if(!visited[edge]){
                         visited[edge] = true;
                        queue.add(edge);
                    }
                }
            }
        }
        return false;
    }
}