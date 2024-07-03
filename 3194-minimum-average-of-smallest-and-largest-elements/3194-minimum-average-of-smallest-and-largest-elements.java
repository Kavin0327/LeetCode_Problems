class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double minimumAvg = 51;
        for(int i=0;i<n/2;i++){
            double avg = (nums[i]+nums[n-i-1])/2.0;
            if(minimumAvg > avg)
                minimumAvg = avg;
        }
        return minimumAvg;
    }
}