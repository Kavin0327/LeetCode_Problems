class Solution {
    // Sliding Window Approach
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k < 1)
            return 0;
        int product = 1;
        int left = 0;
        int right = 0;
        int answer = 0;
        int n = nums.length;
        while(right < n){
            product *= nums[right];
            while(product >= k && left <= right){
                product /= nums[left];
                left++;
            }
            answer += right-left+1; // no of subarray
            right++;
        }
        return answer;
    }
}