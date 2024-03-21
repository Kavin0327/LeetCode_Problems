class Solution {
    //Memoization Approach
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        Integer memo[][] = new Integer[n+1][m+1];
        return helper(word1,word2,n,m,memo);
    }
    
    public int helper(String word1,String word2,int index1,int index2,Integer memo[][]){
        if(memo[index1][index2] != null){
            return memo[index1][index2];
        }
        if(index1 == 0){
            return index2;
        }
        if(index2 == 0){
            return index1;
        }
        if(word1.charAt(index1-1) == word2.charAt(index2-1)){
            return memo[index1][index2] = helper(word1,word2,index1-1,index2-1,memo);
        }
        else{
            int insertOp = helper(word1,word2,index1,index2-1,memo);
            int deleteOp = helper(word1,word2,index1-1,index2,memo);
            int replaceOp = helper(word1,word2,index1-1,index2-1,memo);
            return memo[index1][index2] =  1 + Math.min(insertOp,Math.min(deleteOp,replaceOp));
        }
    }
}