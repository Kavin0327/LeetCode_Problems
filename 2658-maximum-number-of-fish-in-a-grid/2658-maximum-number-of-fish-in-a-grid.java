class Solution {
    private int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};
    public int DFS(int arr[][],int r,int c){
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0 ;
        if(r >= n || c >= m || r < 0 || c < 0 ||arr[r][c] <= 0 )
            return 0;
        sum += arr[r][c];
        arr[r][c] = -1;
        for(int dir[] :directions){
           sum += DFS(arr,r+dir[0],c+dir[1]);
        }
        return sum;
    }
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] > 0 )
                    maxFish  = Math.max(DFS(grid,i,j),maxFish);
            }
        }
        return maxFish;
    }
}