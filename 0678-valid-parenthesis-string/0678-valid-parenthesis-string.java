class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> oBracket = new Stack<>();
        Stack<Integer> star = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c == '('){
                oBracket.push(i);
            }
            else if( c == '*'){
                star.push(i);
            }
            else{
                if(!oBracket.isEmpty())
                    oBracket.pop();
                else if(!star.isEmpty())
                    star.pop();
                else
                    return false;
            }
        }
        while(!oBracket.isEmpty() && !star.isEmpty()){
            if(oBracket.peek() > star.peek())
                return false;
            oBracket.pop();
            star.pop();
        }
        return oBracket.isEmpty();
    }
}