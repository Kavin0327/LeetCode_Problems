class Solution {
    // public ListNode reverse(ListNode head){
    //     ListNode curr = head;
    //     ListNode prev = null;
    //     while(curr != null){
    //         ListNode nextNode = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = nextNode;
    //     }
    //     return prev; 
    // }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        for(int i=0;i<k;i++){
            if(curr == null)
                return head;
            curr = curr.next;
        }   
        ListNode prev = null;
        curr = head;
        for(int i=0;i<k;i++){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head.next = reverseKGroup(curr,k);
        return prev;
    }
}