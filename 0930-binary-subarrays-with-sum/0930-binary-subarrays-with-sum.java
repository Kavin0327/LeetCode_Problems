class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int right = 0;
        int left = 0;
        int n = nums.length;
        int sum = 0;
        int zeroCount = 0;
        while(right < n){
            sum += nums[right];
            while(left < right && (nums[left] == 0 || sum > goal)){
                if(nums[left] == 0)
                    zeroCount++;
                else
                    zeroCount = 0;
                sum -= nums[left];
                left++;
            }
            if(sum == goal){
                count +=zeroCount+1;
            }
            right++;
        }
        return count;
    }
}