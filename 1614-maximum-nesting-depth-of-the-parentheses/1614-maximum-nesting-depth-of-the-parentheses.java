class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '(')
                count++;
            depth = Math.max(depth,count);
            if(s.charAt(i) == ')')
                count--;
        }
        return depth;
    }
}