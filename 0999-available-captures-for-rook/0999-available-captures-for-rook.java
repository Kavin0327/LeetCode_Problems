class Solution {
    public int numRookCaptures(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int row = 0;
        int col = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'R'){
                    row = i;
                    col = j;
                }
            }
        }
        int attack = 0;
        for(int i=row-1;i>=0;i--){ // up ward 
            if(board[i][col] == 'B') break;
            if(board[i][col] == 'p'){
                attack++;
                break;
            }
        }
        for(int i=row+1;i<n;i++){ // down ward 
            if(board[i][col] == 'B') break;
            if(board[i][col] == 'p'){
                attack++;
                break;
            }
        }
        for(int i=col-1;i>=0;i--){ // left ward 
            if(board[row][i] == 'B') break;
            if(board[row][i] == 'p'){
                attack++;
                break;
            }
                
        }
        for(int i=row+1;i<m;i++){ // right ward 
            if(board[row][i] == 'B') break;
            if(board[row][i] == 'p'){
                attack++;
                break;
             }
        }   
        return attack;
    }
}