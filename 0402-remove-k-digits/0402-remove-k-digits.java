class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(n == k)
            return "0";
        if(k == 0)
            return num;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = num.charAt(i);
            while(!stack.isEmpty() && k > 0 && stack.peek() > ch){
                k--;
                stack.pop();
            }
            stack.push(ch);
        }
        while(k > 0){  // for i/p = 123456,k = 3  o/p = 123
             stack.pop();
            k--;
        }
        StringBuilder answer = new StringBuilder();
        while(!stack.isEmpty()){
            answer.append(stack.pop());
        }
        answer.reverse();
        while(answer.length() > 1 &&  answer.charAt(0) == '0'){ //removing tailing zeros
            answer.deleteCharAt(0);
        }
        return answer.toString();
    }
}