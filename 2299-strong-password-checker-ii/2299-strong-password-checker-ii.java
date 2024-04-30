class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if(n < 8){ //check length at most 8
            return false;
        }
        for(int i=1;i<n;i++){ // adjacent same condition
            if(password.charAt(i-1) == password.charAt(i))
                return false;
        }
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean number = false;
        for(int i=0;i<n;i++){
            char c = password.charAt(i);
            if(Character.isUpperCase(c)){
                upper = true;
            }
            else if(Character.isLowerCase(c)){
                lower = true;
            }
            else if(Character.isDigit(c)){
                number = true;
            }
            else {
                special = true;
            }
        }
        return upper && lower && number && special;
    }
}