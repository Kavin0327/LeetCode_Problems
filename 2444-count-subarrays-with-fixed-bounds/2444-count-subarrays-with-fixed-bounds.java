class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long answer = 0;
        int right = 0;
        int notMinOrMax = -1;
        int n = nums.length;
        int minIndex = -1;
        int maxIndex = -1;
        while(right < n){
            if(nums[right] < minK || nums[right] > maxK){
                notMinOrMax = right;
            }
            if(nums[right] == minK)
                minIndex = right;
            if(nums[right] == maxK)
                maxIndex = right;
            answer += Math.max(0,Math.min(minIndex,maxIndex)-notMinOrMax);
            right++;
        }
        return answer;
    }
}