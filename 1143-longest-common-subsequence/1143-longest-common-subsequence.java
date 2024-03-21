class Solution {
    // Memoization Approach
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        Integer arr[][] = new Integer[n][m];
        return helper(text1,text2,0,0,n,m,arr);
    }
    public int helper(String S1,String S2,int index1,int index2,int n,int m,Integer arr[][]){
        if(index1 >= n || index2 >= m){
            return 0;
        }
        if(arr[index1][index2] != null){
            return arr[index1][index2];
        }
        if(S1.charAt(index1) == S2.charAt(index2)){
             arr [index1][index2] = 1 + helper(S1,S2,index1+1,index2+1,n,m,arr);
            return arr[index1][index2];
             // return arr [index1][index2] = 1 + helper(S1,S2,index1+1,index2+1,n,m,arr); // both are same
        }
        else{
            int L1 = helper(S1,S2,index1+1,index2,n,m,arr);
            int R1 = helper(S1,S2,index1,index2+1,n,m,arr);
            return arr[index1][index2] = Math.max(L1,R1);
        }
    }
}