class Solution {
    //Memoization Apporach
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Integer memo[][] = new Integer[n][m];
        return helper(nums1,nums2,0,0,n,m,memo);
    }
    public int helper(int arr1[],int arr2[],int index1,int index2,int n,int m,Integer memo[][]){
        if(index1 == n || index2 == m)
            return 0;
        if(memo[index1][index2] != null){
            return memo[index1][index2];
        }
        if(arr1[index1] == arr2[index2]){
            return memo[index1][index2] = 1 + helper(arr1,arr2,index1+1,index2+1,n,m,memo);
        }
        else{
            int first = helper(arr1,arr2,index1+1,index2,n,m,memo);
            int second = helper(arr1,arr2,index1,index2+1,n,m,memo);
            return memo[index1][index2] = Math.max(first,second);
        }
    }
}