class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;
        int n = nums.length;
        int freq[] = new int[101];
        for(int x:nums){
            freq[x]++;
            if(maxFreq < freq[x])
                maxFreq = freq[x];
        }
        if(maxFreq == 1)
            return n;
        int count = 0;
        for(int i=0;i<101;i++){
            if(freq[i] == maxFreq)
                count++;
        }
        return count*maxFreq;
    }
}