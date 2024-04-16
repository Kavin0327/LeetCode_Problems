class Solution {
    public String findLatestTime(String s) {
        StringBuilder answer = new StringBuilder();
        if(s.charAt(0) == '?' && s.charAt(1) == '?'){
            answer.append("11");
        }
        else if(s.charAt(0) == '?'){
            if(s.charAt(1) <= '1')
                answer.append('1');
            else
                answer.append('0');
            answer.append(s.charAt(1));
        }
        else if(s.charAt(1) == '?'){
            answer.append(s.charAt(0));
            if(s.charAt(0) < '1')
                answer.append('9');
            else
                answer.append('1');
        }
        else{
            answer.append(s.charAt(0));
            answer.append(s.charAt(1));
        }
        
        answer.append(":");
        
        if(s.charAt(3) == '?' && s.charAt(4) == '?'){
            answer.append("59");
        }
        else if(s.charAt(3) == '?'){
            answer.append('5');
            answer.append(s.charAt(4));
        }
        else if(s.charAt(4) == '?'){
            answer.append(s.charAt(3));
            answer.append('9');
        }
        else{
            answer.append(s.charAt(3));
            answer.append(s.charAt(4));
        }
        return answer.toString();
    }
}