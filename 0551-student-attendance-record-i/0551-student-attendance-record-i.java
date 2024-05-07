class Solution {
    public boolean checkRecord(String s) {
        int A = 0;
        for(char c:s.toCharArray()){
            if(c == 'A'){
                A++;
            }
        }
        return s.indexOf("LLL") == -1 && A < 2;
    }
}