class Solution {
    //Memoization Approach
    public int maxProfit(int[] prices, int fee) {
        Integer memo[][] = new Integer[prices.length][2];
        return helper(prices,0,0,fee,memo);
    }
    
    public int helper(int arr[],int index,int posses,int fee,Integer memo[][]){
        if(index == arr.length)
            return 0;
        if(memo[index][posses] != null)
            return memo[index][posses];
        if(posses == 0){
            int buy = helper(arr,index+1,1,fee,memo)-arr[index]; 
            int skipBuy = helper(arr,index+1,0,fee,memo);
            return memo[index][posses] = Math.max(buy,skipBuy);
        }
        else{
            int sell = helper(arr,index+1,0,fee,memo)+arr[index]-fee;
            int skipSell =  helper(arr,index+1,1,fee,memo);
            return memo[index][posses] = Math.max(sell,skipSell);
        }
    }
}