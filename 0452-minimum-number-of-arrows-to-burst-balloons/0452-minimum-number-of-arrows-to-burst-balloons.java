class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(x,y) -> Integer.compare(x[1],y[1]));
        int noOfArrows = 1;
        int prev = points[0][1];
        int n = points.length;
        for(int i=1;i<n;i++){
            if(prev < points[i][0] ){
                noOfArrows++;
                prev = points[i][1];
            }
        }
        // for(int arr[]:points){
        //     System.out.println(Arrays.toString(arr));
        // }
        return noOfArrows;
    }
}