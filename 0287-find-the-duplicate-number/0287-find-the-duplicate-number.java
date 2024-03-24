class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int freq[] = new int[n+1];
        for(int x:nums){
            freq[x]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i] > 1){
                return i;
            }
        }
        return -1;
    }
}