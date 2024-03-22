
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        while(hare != null && hare.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        ListNode prev = null;
        ListNode nextNode = null;
        while(tortoise != null){    
            nextNode = tortoise.next;
            tortoise.next = prev;
            prev = tortoise;
            tortoise = nextNode;
        }
        if(prev != null){
            while(head != null && prev != null){
                if(head.val != prev.val)
                    return false;
                head = head.next;
                prev = prev.next;
            }
        }
        return true;
    }
}