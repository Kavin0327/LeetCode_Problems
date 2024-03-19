class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        // int left[] = new int[n];
        int result[] = new int[n];
        // Arrays.fill(left,1);
        Arrays.fill(result,1);
        int maxChocolate = 0;
        //  left to right
        for(int i=1;i<n;i++){
            if(ratings[i-1] < ratings[i])
                result[i] = result[i-1]+1;
        }
        
        // right to left
        for(int i=n-2;i>=0;i--){
            if(ratings[i+1] < ratings[i]){
                result[i] = Math.max(result[i],result[i+1]+1);
            }         
        }
        
        for(int i=0;i<n;i++){
            maxChocolate += result[i];
        }
        return maxChocolate;
    }
}