package Topic.Finding_and_deleting_specified_links;

public class LinkList2App {
    public static void main() {
        LinkList linkList = new LinkList();
        linkList.insertFirst(22,2.99);
        linkList.insertFirst(44,4.99);
        linkList.insertFirst(66,6.99);
        linkList.insertFirst(88,8.99);

        linkList.displayList();

        //find item
        Link f = linkList.find(44);

        if(f != null){
            System.out.println("Found link with key");
        }else {
            System.out.println("Can't delete link");
        }

        Link d = linkList.delete(66);
        if(d!=null){
            System.out.println("Deleted link with key "+d.iData);
        }else {
            System.out.println("Can't delete link");
        }

    }
}
