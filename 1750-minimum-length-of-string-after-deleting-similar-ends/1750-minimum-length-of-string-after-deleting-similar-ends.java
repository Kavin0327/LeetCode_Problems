class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        if(n == 1)
            return 1;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }
            char copy = s.charAt(left);
            while(left <= right && s.charAt(left) == copy)
                left++;
            while(left <= right && s.charAt(right) == copy)
                right--;
        }
        return (right-left)+1;
    }
}