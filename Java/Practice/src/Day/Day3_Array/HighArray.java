package Day.Day3_Array;

public class HighArray {
    double[] a;
    int nElems;

    public HighArray(int max) {
        a = new double[max];
        nElems = 0;
    }

    //    ========================================================
    public boolean find(double searchKey) {
        int j = 0;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }

    //    ========================================================
    public void insert(double value) {
        a[nElems] = value;
        nElems++;
    }

    //    ========================================================
    public boolean delete(double value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j])
                break;
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems - 1; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }

    //    ========================================================
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}
