/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode copy = dummy;
        ListNode temp = head.next;
        if(temp == null )
            return head;
        while(temp != null){
            int sum = 0;
            while(temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }
            dummy.next = new ListNode(sum);
            dummy = dummy.next;
            temp = temp.next;
        }
        return copy.next;
    }
}