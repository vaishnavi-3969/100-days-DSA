package Topic.Finding_and_deleting_specified_links;

public class Link {
    int iData;
    double dData;
    Link next;

    Link(int id, double dd){
        iData = id;
        dData = dd;
    }

    void displayLink(){
        System.out.print("{" + iData + ", " + dData + "}");
    }
}
