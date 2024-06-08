class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;
        int prefixSum = 0;
        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            if(map.containsKey(prefixSum%k) && (i-map.get(prefixSum%k))>1){
                return true;  
            }
            map.putIfAbsent(prefixSum%k,i);
        }
       return false;
    }
}