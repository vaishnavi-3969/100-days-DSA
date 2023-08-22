public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data; //generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(SinglyLinkedList sll){
        ListNode ptr = sll.head;
        while(ptr!=null){
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    public int length(SinglyLinkedList sll){
        ListNode ptr = sll.head;
        int length = 0;
        while(ptr!=null){
            length++;
            ptr = ptr.next;
        }
        return length;
    }
    public SinglyLinkedList insertNodeAtBeginning(SinglyLinkedList sll, ListNode ln){
        ln.next = sll.head;
        sll.head = ln;
        display(sll);
        return sll;
    }
    public SinglyLinkedList insertNodeAtEnd(SinglyLinkedList sll, ListNode ln){
        if(sll.head==null){
            sll.head = ln;
            return sll;
        }
        ListNode ptr = sll.head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next = ln;
        sll.display(sll);
        return sll;
    }
    public SinglyLinkedList insertNodeAtGivenPosition(SinglyLinkedList sll,ListNode ln, int position){
        ListNode ptr = sll.head;
        if(position == 1){
            insertNodeAtBeginning(sll,ln);
            return sll;
        }
        for(int i=1; i<position-1; i++){
            ptr = ptr.next;
        }
        ListNode temp = ptr.next;
        ptr.next = ln;
        ln.next = temp;
        display(sll);
        return sll;
    }
    public ListNode deleteFirstNode(SinglyLinkedList sll){
        ListNode ln = sll.head;
        if(ln==null){
            return null;
        }
        sll.head = sll.head.next;
        ln.next = null;
        return ln;
    }
    public ListNode deleteLastNode(SinglyLinkedList sll){
        ListNode temp = sll.head;
        if(head == null || head.next == null){
            return head;
        }
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        display(sll);
        return temp;
    }
    public ListNode deleteNodeFromGivenPosition(SinglyLinkedList sll, int position){
        ListNode temp = sll.head;
        if(position==1){
            head = head.next;
        }else {
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            ListNode tempo = temp.next;
            temp.next = temp.next.next;
            display(sll);
            return tempo;
        }
        return null;
    }
    public int search(SinglyLinkedList sll, int data){
        ListNode ptr = sll.head;
        int index = 1;
        while(ptr != null){
            if(ptr.data == data){
                System.out.println("Element found at position: "+index);
                return index;
            }
            index++;
            ptr=ptr.next;
        }
        System.out.println("Element not found!");
        return -1;
    }
    public SinglyLinkedList reverse(SinglyLinkedList sll){
        if(head==null){
            return sll;
        }
        ListNode current = sll.head;
        ListNode previous=null,next=null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        sll.head = previous;
        display(sll);
        return sll;
    }
    public ListNode nthNodeFromEnd(SinglyLinkedList sll, int n){
        if(head==null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid value: n="+n);
        }
        ListNode mainPtr = sll.head;
        ListNode refPtr = sll.head;
        int count = 0;
        while(count < n){
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public int middleElement(SinglyLinkedList sll){
        ListNode slowPtr = sll.head;
        ListNode fastPtr = sll.head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }
    public void removeDuplicatedFromSortedArray(SinglyLinkedList sll){
        ListNode ptr = sll.head;
        if(ptr==null){
            return;
        }
        while (ptr!=null && ptr.next!=null){
            if(ptr.data == ptr.next.data){
                ptr.next = ptr.next.next;
            }else{
                ptr = ptr.next;
            }
        }
    }
    public ListNode insertNodeInSortedSSL(SinglyLinkedList sll, ListNode ln){
        if(sll.head==null){
            return ln;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current!=null && current.data < ln.data){
            temp = current;
            current = current.next;
        }
        ln.next = current;
        temp.next = ln;
        return head;
    }
    public ListNode detectLoop(SinglyLinkedList sll){
        ListNode fastPtr = sll.head;
        ListNode slowptr = sll.head;
        while(fastPtr !=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowptr = slowptr.next;
            if(slowptr == fastPtr){
                return slowptr;
            }
        }
        return null;
    }
    public ListNode findStartOfLoop(SinglyLinkedList sll){
        ListNode fastPtr = sll.head, slowPtr = sll.head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return getStartingNode(sll,slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(SinglyLinkedList sll, ListNode slowPtr) {
        ListNode temp = sll.head;
        while(slowPtr != temp){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public void detectAndRemoveLoop(SinglyLinkedList sll){
        ListNode slowPtr = sll.head, fastPtr = sll.head;
        while(fastPtr.next!=null && fastPtr!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                removeLoop(sll, slowPtr);
                return;
            }
        }
    }

    private void removeLoop(SinglyLinkedList sll, ListNode slowPtr) {
        ListNode temp = sll.head;
        while(slowPtr.next!=temp.next){
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        slowPtr.next = null;
    }
    public ListNode merge2SortedSLL(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a!=null && b!=null){
            if(a.data <=b.data){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b= b.next;
            }
            tail = tail.next;
        }
        if(a==null){
            tail.next = b;
        }else{
            tail.next = a;
        }
        return dummy.next;
    }
    public SinglyLinkedList add2SLL(SinglyLinkedList a, SinglyLinkedList b){
        ListNode aPtr = a.head;
        ListNode bPtr = b.head;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        SinglyLinkedList sll = new SinglyLinkedList();
        while(aPtr!=null || bPtr!=null){
            int x = (aPtr!=null)?aPtr.data : 0;
            int y = (bPtr!=null)?bPtr.data : 0;
            int sum = carry + x + y;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            if(aPtr!=null) aPtr = aPtr.next;
            if(bPtr!=null) bPtr = bPtr.next;
            tail = tail.next;
        }
        if(carry>0){
            tail.next = new ListNode(carry);
        }
        sll.head = dummy.next;
        display(sll);
        return sll;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println("Displaying the SLL: ");
        sll.display(sll);
        System.out.println("\nDetecting Loop: "+sll.detectLoop(sll));
        System.out.println("Length of the SLL: "+sll.length(sll));
        SinglyLinkedList sll3 = new SinglyLinkedList();
        System.out.println("Empty SLL: ");
        sll3.display(sll3);
        System.out.println();
        System.out.println("Length of SLL2: "+sll3.length(sll3));
        System.out.println("Inserting node at beginning: ");
        sll.insertNodeAtBeginning(sll,new ListNode(0));
        System.out.println();
        System.out.println("Insert node at end: \n");
        sll.insertNodeAtEnd(sll,new ListNode(50));
        System.out.println("\nInsert at a specific position");
        sll.insertNodeAtGivenPosition(sll,new ListNode(45),6);
        System.out.println("\nDeleting first node: "+sll.deleteFirstNode(sll));
        sll.display(sll);
        System.out.println("\nDeleting last node: ");
        sll.deleteLastNode(sll);
        System.out.println("\nDeleting node from given position:");
        sll.deleteNodeFromGivenPosition(sll, 3);
        System.out.println("\nSearching: ");
        sll.search(sll,20);
        sll.search(sll,0);
        System.out.println("\nReversing the SLL: ");
        sll.reverse(sll);
        System.out.println();
        sll.insertNodeAtEnd(sll,new ListNode(0));
        System.out.println();
        sll.middleElement(sll);
        System.out.println("\nMiddle Element: "+sll.middleElement(sll));
        System.out.println("\nNth element from end: ");
        sll.nthNodeFromEnd(sll,2);
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertNodeAtBeginning(sll2,new ListNode(10));
        System.out.println();
        sll2.insertNodeAtEnd(sll2,new ListNode(20));
        System.out.println();
        sll2.insertNodeAtEnd(sll2,new ListNode(20));
        System.out.println();
        sll2.insertNodeAtEnd(sll2,new ListNode(20));
        System.out.println();
        sll2.insertNodeAtEnd(sll2,new ListNode(30));
        System.out.println();
        sll2.insertNodeAtEnd(sll2,new ListNode(40));
        System.out.println();
        sll2.display(sll2);
        System.out.println("\nRemoving duplicated nodes: ");
        sll2.removeDuplicatedFromSortedArray(sll2);
        sll2.display(sll2);
        System.out.println("\nInserting a node in a sorted SLL: ");
        sll2.insertNodeInSortedSSL(sll2,new ListNode(50));
        sll2.display(sll2);
        System.out.println("\n================================================");
        SinglyLinkedList sll4 = new SinglyLinkedList();
        ListNode sll3_first = new ListNode(10);
        ListNode sll3_second = new ListNode(20);
        ListNode sll3_third = new ListNode(30);
        sll4.head = sll3_first;
        sll3_first.next = sll3_second;
        sll3_second.next = sll3_third;
        sll3_third.next = sll3_second;
        System.out.println("Detecting Loop: "+sll4.detectLoop(sll4).data);
        System.out.println("Finding the starting of loop: "+sll.findStartOfLoop(sll4).data);
        System.out.println("Removing Loop: ");
        sll4.detectAndRemoveLoop(sll4);
        sll4.display(sll4);
        System.out.println("\n================================================");
        System.out.println("Merging 2 Sorted SLL to form a new Sorted SLL \n1st Sorted List:");
        SinglyLinkedList sll5 = new SinglyLinkedList();
        sll5.insertNodeAtBeginning(sll5,new ListNode(0));
        System.out.println();
        sll5.insertNodeAtEnd(sll5,new ListNode(4));
        System.out.println();
        sll5.insertNodeAtEnd(sll5,new ListNode(8));
        System.out.println("2nd Sorted List:");
        SinglyLinkedList sll6 = new SinglyLinkedList();
        sll6.insertNodeAtBeginning(sll6,new ListNode(3));
        System.out.println();
        sll6.insertNodeAtEnd(sll6,new ListNode(6));
        System.out.println();
        sll6.insertNodeAtEnd(sll6,new ListNode(8));
        System.out.println();
        sll6.insertNodeAtEnd(sll6,new ListNode(20));
        System.out.println();
        ListNode newHead = sll6.merge2SortedSLL(sll5.head, sll6.head);
        System.out.println("Sorted SLL: ");
        while(newHead!=null){
            System.out.print(newHead.data+"-->");
            newHead = newHead.next;
        }
        System.out.println("null");
        System.out.println("Adding 2 lists: ");
        sll5.display(sll5);
        System.out.println();
        sll6.display(sll6);
        System.out.println();
        sll6.add2SLL(sll5,sll6);
//        0-->3-->4-->6-->8-->8-->20-->null
//        3-->4-->6-->8-->8-->20-->null
//        3-->7-->0-->5-->7-->9-->2-->2-->null
        System.out.println("\n==========================================================");
    }
}
