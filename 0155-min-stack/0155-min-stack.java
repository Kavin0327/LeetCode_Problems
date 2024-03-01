class MinStack {
    Stack<Integer> stack;
    int minValue;
    
    public MinStack() {
        stack = new Stack<>();
        minValue = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val <= minValue){
            stack.push(minValue);
            minValue = val;
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek() == minValue){
            stack.pop();
            minValue = stack.peek();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */