class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int remove = n/20;
        double answer = 0.0;
        int div = 0;
        for(int i=remove;i<n-remove;i++){
            answer += (double)arr[i];
            div++;
        }
        return answer/div;
    }
}