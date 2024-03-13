class Solution {
    public int pivotInteger(int n) {
        int pivot = -1;
        int prefixSum[] = new int[n+1];
        for(int i=1;i<=n;i++){
            prefixSum[i] += prefixSum[i-1]+i;
        }
        int total = prefixSum[n];
        for(int i=1;i<=n;i++){
            if(total-prefixSum[i]+(i) == prefixSum[i]){
                return i;
            }
        }
        // System.out.println(Arrays.toString(prefixSum));
        return -1;
    }
}