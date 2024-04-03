class Solution {
    public boolean dfs(boolean vis[][],char [][]arr,int row,int col,int index,String word){
        if(index == word.length()){
            return true;
        }
        if(row < 0 || col < 0 || col >= arr[0].length ||row >= arr.length || vis[row][col] || arr[row][col] != word.charAt(index)){
            return false;
        }
        vis[row][col] = true;
        if(dfs(vis,arr,row,col-1,index+1,word) || dfs(vis,arr,row-1,col,index+1,word) ||
               dfs(vis,arr,row+1,col,index+1,word) || dfs(vis,arr,row,col+1,index+1,word))
                    return true;
        vis[row][col] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
            int n = board.length;
            int m = board[0].length;
            boolean vis[][] = new boolean[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(board[i][j] == word.charAt(0)){
                        if(dfs(vis,board,i,j,0,word)){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    
}