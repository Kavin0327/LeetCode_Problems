class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> val:map.entrySet()){
            if(val.getValue() == 2)
                answer.add(val.getKey());
        }
        return answer;
    }
}