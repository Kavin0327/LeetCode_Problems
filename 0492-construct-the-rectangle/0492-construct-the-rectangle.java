class Solution {
    public int[] constructRectangle(int area) {
        int W = (int)Math.sqrt(area);
        for(int i=W;i>=1;i--){
            int L = area/i;
            if(L*i == area){
                return new int[]{L,i};
            }
        }
        return new int[]{area,1};
    }
}