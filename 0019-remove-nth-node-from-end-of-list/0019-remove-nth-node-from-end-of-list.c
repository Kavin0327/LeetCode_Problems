struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* p = head;
    struct ListNode* q = NULL;
    struct ListNode* next = NULL;
    int count = 0;

    for(; p ; p = p->next){
        count++;
    }

    int num = count - n + 1;     //size + count - 1
    if(num == 1){
        p = head;
        q = p->next;
        head = q;
        free(p);
        return head;
    }

    if(num == count){
        p = head;
        for(; p->next; p = p->next){
            q = p;
        }
        q->next = NULL;
        free(p);
        return head;
    }

    p = head;
    for(int i = 1; i < num; i++){
        q = p;
        p = p->next;
    }

    next = p->next;
    q->next = next;
    free(p);
    return head;
}