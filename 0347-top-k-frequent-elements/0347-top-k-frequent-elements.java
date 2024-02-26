class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(x,y)-> map.get(y) - map.get(x));
        // System.out.println(list);
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}