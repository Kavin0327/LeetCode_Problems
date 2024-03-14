class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = heights.length;
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty())
                leftSmall[i] =  0;
            else
                leftSmall[i] = stack.peek()+1;
            stack.push(i);
        }
        while(!stack.isEmpty())
            stack.pop();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty())
                rightSmall[i] =  n-1;
            else
                rightSmall[i] = stack.peek()-1;
            stack.push(i);
        }
        
        for(int i=0;i<n;i++){
            max = Math.max(max,(rightSmall[i] - leftSmall[i]+1)*heights[i]);
        }
        return max;
    } 
}