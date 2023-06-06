package Topic.Simple_Linked_List;

public class LinkListApp {
    public static void main() {
        LinkList linkList = new LinkList();
        linkList.insertFirst(22,2.99);
        linkList.insertFirst(44,4.99);
        linkList.insertFirst(66,6.99);
        linkList.insertFirst(88,8.99);

        linkList.displayList();

        while (!linkList.isEmpty()){
            Link link = linkList.deleteFirst();
            System.out.print("Deleted ");
            link.displayLink();
            System.out.println(" ");
        }
        linkList.displayList();
    }
}
