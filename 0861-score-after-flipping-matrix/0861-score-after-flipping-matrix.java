class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int answer = 0;
        answer = (1<<(m-1))*n;
        for(int i=1;i<m;i++){
            int bitCount = 0;
            for(int j=0;j<n;j++){
                if(grid[j][i] == grid[j][0])
                    bitCount++;
            }
            if(bitCount < n-bitCount)
                bitCount = n-bitCount;
            answer += (1<<(m-i-1))*bitCount;
        }
        return answer;
    }
}