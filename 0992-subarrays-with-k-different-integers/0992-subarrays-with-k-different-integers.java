class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int n = nums.length;
        for(int right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(left < right && map.size() > k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                left++;
            }
            answer += right-left+1;
        }
        k = k-1;
        if(k == 0)
            return answer;
        left = 0;
        map.clear();
         for(int right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(left < right && map.size() > k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                left++;
            }
            answer -= right-left+1;
         }
        return answer;
    }
}