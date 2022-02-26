    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    // Write your code here
    
    if (head == null) return null;
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        if (position == 0) {
            temp.next = head;
            return temp;
        }
        SinglyLinkedListNode p = head;
        for (int i = 0; i< position-1; i++) {
            p = p.next;
        }
      
      
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
        SinglyLinkedListNode next = p.next;
        p.next = temp;
        temp.next = next;
        return head;
    }

}
