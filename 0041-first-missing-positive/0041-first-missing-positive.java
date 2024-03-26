class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean arr[] = new boolean[n+2];
        for(int x:nums){
            if(x > 0 && x <= n )
                arr[x] = true;
        }
        for(int i=1;i<=n+1;i++)
            if(!arr[i])
                return i;
        return 1;
    }
}