class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        if(n == 0)
            return 0;
        Map<Integer,Integer> map = new HashMap<>();
        int answer = 0;
        for(int x:nums1){
            for(int y:nums2){
                int sum = x+y;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(int x:nums3){
            for(int y:nums4){
                int sum = x+y;
                answer += map.getOrDefault(-sum,0); // duplicates 
            }
        }
        return answer;
    }
}