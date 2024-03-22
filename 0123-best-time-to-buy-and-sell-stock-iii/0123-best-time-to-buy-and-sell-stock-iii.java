class Solution {
    //Memoization Approach
    public int maxProfit(int[] prices) {
        Integer memo[][][] = new Integer[prices.length][2][4];
        return helper(prices,0,0,0,memo);
    }
    public int helper(int arr[],int index,int posses,int limit,Integer memo[][][]){
        if(index == arr.length || limit == 4)
            return 0;
        if(memo[index][posses][limit] != null)
            return memo[index][posses][limit];
        if(posses == 0){
            int buy = helper(arr,index+1,1,limit+1,memo)-arr[index];
            int skipBuy = helper(arr,index+1,0,limit,memo);
            return memo[index][posses][limit] = Math.max(buy,skipBuy);
        }
        else{
            int sell = helper(arr,index+1,0,limit+1,memo)+arr[index];
            int skipSell = helper(arr,index+1,1,limit,memo);
            return memo[index][posses][limit] = Math.max(sell,skipSell);
        }
    }
}