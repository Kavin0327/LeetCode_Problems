class Solution {
    //Memoization Approach
    public int maxProfit(int k, int[] prices) {
        Integer memo[][][] = new Integer[prices.length][2][2*k];
        return helper(prices,0,0,0,memo,k);
    }
    public int helper(int arr[],int index,int posses,int limit,Integer memo[][][],int k){
        if(index == arr.length || limit == 2*k)
            return 0;
        if(memo[index][posses][limit] != null)
            return memo[index][posses][limit];
        if(posses == 0){
            int buy = helper(arr,index+1,1,limit+1,memo,k)-arr[index];
            int skipBuy = helper(arr,index+1,0,limit,memo,k);
            return memo[index][posses][limit] = Math.max(buy,skipBuy);
        }
        else{
            int sell = helper(arr,index+1,0,limit+1,memo,k)+arr[index];
            int skipSell = helper(arr,index+1,1,limit,memo,k);
            return memo[index][posses][limit] = Math.max(sell,skipSell);
        }
    }
}