class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        // Map<Integer,Integer> map = new HashMap<>();
        int  n = nums.length;
        int freq[] = new int[n+1];
        for(int x:nums){
            freq[x]++;
        }
        for(int i=0;i<=n;i++){
            if(freq[i] == 2)
                answer.add(i);
        }
        return answer;
    }
}