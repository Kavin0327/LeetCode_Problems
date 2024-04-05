class Solution {
    public String makeGood(String s) {
        StringBuilder answer = new StringBuilder();
        // int n = s.length();
        for(char c:s.toCharArray()){
            if(answer.length() > 0 && (answer.charAt(answer.length()-1) != c) && (Character.toUpperCase(c) == (Character.toUpperCase(answer.charAt(answer.length()-1))))){
                answer.deleteCharAt(answer.length()-1);
            }
            else{
                answer.append(c);
            }
        }
        return answer.toString();
    }
}