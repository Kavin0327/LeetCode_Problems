class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack();
        int n = nums.length;
        int len = n*2;  
        int answer[] = new int[n];
        for(int i=len-1;i>=0;i--){
           while(!stack.isEmpty() && stack.peek() <= nums[i%n]){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    answer[i] = -1;
                }else{
                    answer[i] = stack.peek();
                }
            }
            stack.push(nums[i%n]); 
        }
        return answer;
    }
}