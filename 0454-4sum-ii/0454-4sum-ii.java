class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
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
                answer += map.getOrDefault(-sum,0); //beacuse of elements duplicates 
            }
        }
        return answer;
    }
}