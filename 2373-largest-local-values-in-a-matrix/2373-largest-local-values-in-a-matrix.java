class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int answer[][] = new int[n-2][m-2];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                int max_value = 0;
                for(int k=i-1;k<=i+1;k++){
                    for(int l=j-1;l<=j+1;l++){
                        if(max_value < grid[k][l])
                            max_value = grid[k][l];
                    }
                }
                answer[i-1][j-1] = max_value;
            }
        }
        return answer;
    }
}