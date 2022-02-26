//--------replace Llist with head in the function declaration ------ 

public static void reversePrint(SinglyLinkedListNode head) {
    // Write your code here
        {
            Stack st=new Stack();
            SinglyLinkedListNode temp=head;
            while(temp!=null)
            {
                st.push(temp);
                temp=temp.next;
            }
            while(st.isEmpty()!=true)
            {
              
              
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
                SinglyLinkedListNode temp2=(SinglyLinkedListNode)st.pop();
                System.out.println(temp2.data);
            }
        }
