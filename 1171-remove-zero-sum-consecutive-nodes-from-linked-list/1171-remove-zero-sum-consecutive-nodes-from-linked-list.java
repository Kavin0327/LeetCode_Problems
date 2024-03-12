class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode answer = new ListNode(0);
        answer.next = head;
        ListNode currNode = answer;
        int prefixSum = 0;
        Map<Integer,ListNode> prefixSumMap = new HashMap<>();
        while(currNode != null){
            prefixSum += currNode.val;
            if(prefixSumMap.containsKey(prefixSum)){
                currNode = prefixSumMap.get(prefixSum).next;
                int sum = prefixSum + currNode.val;
                while(sum != prefixSum){
                    prefixSumMap.remove(sum);
                    currNode = currNode.next;
                    sum += currNode.val;
                }
                prefixSumMap.get(prefixSum).next = currNode.next;
            }
            else{
                prefixSumMap.put(prefixSum,currNode);
            }
            currNode = currNode.next;
        }
        return answer.next; 
    }
}