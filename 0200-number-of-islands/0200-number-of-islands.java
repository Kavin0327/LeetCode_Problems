class Solution {
    // DFS Traversal
    public int numIslands(char[][] grid) {
        int noOfIsland = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    noOfIsland++;
                    clearLandArea(grid,i,j,n,m);
                }
            }
        }
        return noOfIsland;
    }
    public void clearLandArea(char arr[][],int r,int c,int n,int m){
        // Base Condition
        if(r < 0 || r >= n || c < 0 || c >= m || arr[r][c] == '0')
            return ;
        arr[r][c] = '0';
        clearLandArea(arr,r,c-1,n,m);//left
        clearLandArea(arr,r-1,c,n,m);//up
        clearLandArea(arr,r,c+1,n,m);//right
        clearLandArea(arr,r+1,c,n,m);//down
    }
}