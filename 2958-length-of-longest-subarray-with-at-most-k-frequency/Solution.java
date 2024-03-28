class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        int n = nums.length;
        int maxLength = 0;
        int right = -1;
        for(int left = 0;left<n;left++){
            while(right+1 < n && freqMap.getOrDefault(nums[right+1],0) < k){
                right++;
                freqMap.put(nums[right],freqMap.getOrDefault(nums[right],0)+1);
            }
            freqMap.put(nums[left],freqMap.get(nums[left])-1);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
