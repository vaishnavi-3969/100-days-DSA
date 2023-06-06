package Topic.Simple_Linked_List;

public class LinkList {
    public Link first;
    public LinkList(){
        first = null; //no items on list yet
    }
    public boolean isEmpty(){
        return first == null;
    }
    //inserting node at starting of the list
    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }
    //deleting the starting node
    public Link deleteFirst(){
        //assumes list is not empty
        Link temp = first;
        first = first.next;
        return temp;
    }
    public void displayList(){
        System.out.print("List (first --> last): ");
        Link current = first;
        while(current!= null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
