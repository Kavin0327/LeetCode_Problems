class Solution {
    // Memoization Approach
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        if(sum%2 == 1)
            return false;
        int tar = sum/2;
        Integer memo[][] = new Integer[n][tar+1];
        return helper(nums,0,tar,n,memo) == 1;
    }
    
    public int helper(int arr[],int index,int sum,int n,Integer memo[][]){
        if(index == n || sum < 0){
            return 0;
        }
        if(memo[index][sum] != null){
            return memo[index][sum];
        }
        if(sum == 0){
            return memo[index][sum] = 1;
        }
        else{
           boolean res = (helper(arr,index+1,sum-arr[index],n,memo) == 1)||(helper(arr,index+1,sum,n,memo) == 1); 
            return memo [index][sum] = res?1:0;
        }
    }
}