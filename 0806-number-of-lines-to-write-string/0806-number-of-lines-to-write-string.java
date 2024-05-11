class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int wide = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int w = widths[c-'a'];
            if(wide+w > 100){
                lines++;
                wide = 0;
            }
            wide += w;
        }
        return new int[]{lines,wide};
    }
}