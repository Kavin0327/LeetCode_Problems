class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode Next=null,prev=null;
        while(head!=null){
            Next=head.next;
            head.next=prev;
            prev=head;
            head=Next;
        }
        head=prev;
       return head;
    }
}