class Solution {
    //Memoization Approach
    public int maxProfit(int[] prices) {
        Integer memo[][] = new Integer[prices.length][2];
        return helper(prices,0,0,memo);
    }
    
    public int helper(int arr[],int index,int posses,Integer memo[][]){
        if(index >= arr.length)
            return 0;
        if(memo[index][posses] != null)
            return memo[index][posses];
        if(posses == 0){
            int buy = helper(arr,index+1,1,memo)-arr[index];
            int skipBuy = helper(arr,index+1,0,memo);
            return memo[index][posses] = Math.max(buy,skipBuy);
        }
        else{
            int sell = helper(arr,index+2,0,memo)+arr[index];
            int skipSell = helper(arr,index+1,1,memo);
            return memo[index][posses] = Math.max(sell,skipSell);
        }
    }
}