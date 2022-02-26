------replace "llist" with "head"     in the function nameing section----

 public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
// Write your code here
   
   if(position == 0)
   {
       head=head.next;
       return head;
   }
   else
    {
       SinglyLinkedListNode n1=head;
       for(int i=0;i<position-1 ;i++)
       {
           n1=n1.next;
       }
       n1.next=n1.next.next;
       return head;
   }
    }


//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
