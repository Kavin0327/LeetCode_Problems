class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder answer = new StringBuilder();
        for(char ch:order.toCharArray()){
            if(map.containsKey(ch)){
                answer.append(String.valueOf(ch).repeat(map.get(ch))); // repeat no fo time repeat value
                map.remove(ch);
            }
        }
        for(char key:map.keySet()){
            answer.append(String.valueOf(key).repeat(map.get(key)));
        }
        return answer.toString();
    }
}