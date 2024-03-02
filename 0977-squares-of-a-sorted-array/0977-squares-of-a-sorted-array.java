class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int left = 0;
        int right = n-1;
        for(int i=n-1;i>=0;i--){
            if( Math.abs(nums[left]) > Math.abs(nums[right])){
                answer[i] = nums[left]*nums[left];
                left++;
            }else{
                answer[i] = nums[right]*nums[right];
                right--;
            }
        }
        return answer;
    }
}