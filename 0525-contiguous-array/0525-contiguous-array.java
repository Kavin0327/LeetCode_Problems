class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int answer = 0;
        int sum = 0;
        int n = nums.length;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                sum -= 1;
            }
            else{
                sum += 1;
            }
            if(map.get(sum) == null){
                map.put(sum,i);
            }else{
                answer = Math.max(answer,i-map.get(sum));
            }
        }
        return answer;
    }
}