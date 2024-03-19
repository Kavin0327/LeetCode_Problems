class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals,(x,y)-> x[1]-y[1]);
        int prev = Integer.MIN_VALUE;
        int n = intervals.length;
        for(int i=0;i<n;i++){
            if(prev <= intervals[i][0]){
                count++;
                prev = intervals[i][1];
            }
        }
        return n-count;
    }
}