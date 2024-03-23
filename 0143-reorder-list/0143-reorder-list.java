class Solution {
    public void reorderList(ListNode head) {
       ListNode tortoise = head;
       ListNode hare  = head;
       while(hare != null && hare.next != null){
           tortoise = tortoise.next; 
           hare = hare.next.next;     
       }
       Stack<ListNode> stack = new Stack<>();
       while(tortoise != null){
           stack.push(tortoise);
           tortoise = tortoise.next;
       }
       int size = stack.size()-1;
        
       while(size-- > 0){
            ListNode last = stack.pop();
            ListNode nextNode = head.next;
            head.next = last;
            last.next = head = nextNode;
       }
        
        if(!stack.isEmpty()){
            head.next = stack.pop();
        }
        
        head.next.next = null;
    }
}