package Topic.Priority_Queue;

public class PriorityQ {
    int maxSize, nItems;
    double[] queueArray;

    public PriorityQ(int max) {
        maxSize = max;
        queueArray = new double[max];
        nItems = 0;
    }

    //=============================================================
    public void insert(double item) {
        int j;
        if (nItems == 0) //if no items, insert at 0
            queueArray[nItems++] = item;
        else { //if any items
            //start at end
            for (j = nItems; j >= 0; j--) {
                //if new item larger,
                if (item > queueArray[j])
                    //shift upward
                    queueArray[j + 1] = queueArray[j];
                else //if smaller
                    break; //done shifting
            }//end for
            queueArray[j + 1] = item; ///insert it
            nItems++;
        } //end else(nItems>0)
    } //end insert()

    //=============================================================
    public double remove() { //remove min items
        return queueArray[--nItems];
    }

    //===============================================================
    public double peekMin() { //peek at min item
        return queueArray[nItems - 1];
    }

    //===============================================================
    public boolean isEmpty() {
        return nItems == 0;
    }

    //===============================================================
    public boolean isFull() {
        return nItems == maxSize;
    }
}
