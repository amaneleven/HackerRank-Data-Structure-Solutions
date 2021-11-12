 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data)
 {
 
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
   
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            return node;
        } else {
            node.next = head;
            head = node;
            return head;
        }
    }

// Insert this code 👆 after the whole "IMPORT SECTION" and before "PRIVATE STATIC" section 


//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
