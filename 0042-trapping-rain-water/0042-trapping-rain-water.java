class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int answer = 0;
        int left = 0;
        int right = n-1;
        int leftMax = -1;
        int righttMax = -1;
        while(left < right){
            if(height[left] <= height[right]){
                if(leftMax < height[left])
                    leftMax = height[left];
                else
                    answer += leftMax - height[left];
                left++;
            }
            else{
                if(righttMax < height[right])
                    righttMax = height[right];
                else    
                    answer += righttMax - height[right];
                right--;
            }
        }
        return answer;
    }
}