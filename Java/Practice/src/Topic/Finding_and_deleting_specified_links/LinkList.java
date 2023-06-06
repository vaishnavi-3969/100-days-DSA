package Topic.Finding_and_deleting_specified_links;

public class LinkList {
    private Link first;
    //constructor
    public LinkList(){
        first = null;
    }
    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first; //points to old first link
        first = newLink; //now first points to this
    }
    public Link find(int key){
        //find link with given key //assumes that list is not empty
        Link current = first;
        while(current.iData != key){
            if(current.next!=null){
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }
    public Link delete(int key){
        //delete link with given key
        ///assumes that list is not empty
        Link current = first;
        Link previous = first;
        while(current.iData != key){
            if(current.next == null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if(current == first){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }
    public void displayList(){
        System.out.print("List (first --> last): ");
        Link current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
