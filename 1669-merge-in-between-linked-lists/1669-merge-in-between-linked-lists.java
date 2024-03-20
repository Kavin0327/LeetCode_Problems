class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode endNode = list2;
        while(endNode.next != null){
            endNode = endNode.next;
        }
        ListNode temp = list1;
        ListNode start = null;
        ListNode end = null;
        for(int i=1;temp != null;i++){
            if(i == a){
                start = temp;
            }
            else if(i == b+2){
                end = temp;
                break;
            }
            temp = temp.next;
        }
        start.next = list2;
        endNode.next = end;
        return list1;
    }
}