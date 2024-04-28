class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder answer = new StringBuilder();
        s = s.toUpperCase();
        int n = s.length();
        int c = 0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) != '-'){
                if(c == k){
                    answer.append("-");
                    c = 1;
                    answer.append(s.charAt(i));
                }else{
                    c++;
                    answer.append(s.charAt(i));
                }
            }
        }
        return answer.reverse().toString();
    }
}