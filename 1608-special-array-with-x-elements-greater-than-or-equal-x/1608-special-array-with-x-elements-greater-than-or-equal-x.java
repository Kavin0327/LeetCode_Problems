class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int i=n;i>=0;i--){
            int cnt = 0;
            for(int x:nums){
                if(i <= x)
                    cnt++;
            }
            if(cnt == i)
                return i;
        }
        return -1;
    }
}