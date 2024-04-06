class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    set.add(i);
                }
                else{
                    stack.pop();
                }
            }
            if(s.charAt(i) == '(')
                stack.push(i);
        }
        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}