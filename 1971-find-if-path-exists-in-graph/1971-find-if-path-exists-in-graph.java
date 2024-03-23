class Solution {
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
        return DFS(adjacencyMatrix,source,destination,new HashSet<>());
    }
    
    public boolean DFS(Map<Integer,List<Integer>> map,int src,int des,Set<Integer> visited){
        List<Integer> list = map.get(src);
        if(list != null){
            for(int edge:list){
                if(visited.contains(des))
                    return true;
                if(!visited.contains(edge)){
                    visited.add(edge);
                    DFS(map,edge,des,visited);
                }
            }   
        }
        return visited.contains(des);
    }
}