class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int minutes = 0;
        int freshOrange = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2)
                    queue.add(new int[]{i,j});
                else if(grid[i][j] == 1)
                    freshOrange++;
            }
        }
        int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};
        while(!queue.isEmpty() && freshOrange > 0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int index[] = queue.poll();
                for(int dir[]:directions){
                    int r = index[0]+dir[0];
                    int c = index[1]+dir[1];
                    if(r < 0 || c < 0|| c >= m || r >= n || grid[r][c] != 1){
                        continue;
                    }
                    queue.add(new int[]{r,c});
                    grid[r][c] = 2;
                    freshOrange--;   
                }    
            }
            minutes++;
        }
        return freshOrange == 0?minutes:-1;
    }
}