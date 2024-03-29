class Solution {
    public long countSubarrays(int[] nums, int k) {
        long answer = 0;
        int maxElement = -1;
        for(int x:nums){
            maxElement = Math.max(maxElement,x);
        }
        int n = nums.length;
        int left = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(maxElement == nums[i]){
                count++;
            }
            while(left <= i && count >= k){
                answer += n-i;
                // System.out.println(n-i);
                if(nums[left] == maxElement){
                    count--;
                }
                left++;
            }
        }
        return answer;
    }
}