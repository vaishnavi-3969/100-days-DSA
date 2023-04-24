package Day.Day4_Ordered_Array;

public class OrdArray {
    double[] a;
    int nElems;

    //    constructor
    public OrdArray(int max) {
        a = new double[nElems];
        nElems = 0;
    }

    //    ===========================================================
    public int size() {
        return nElems;
    }

    //    ===========================================================
    public int find(double searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int mid;

        while (true) {
            mid = (lowerBound + upperBound) / 2;
            if (a[mid] == searchKey) {
                return mid;
            } else {
                if (a[mid] < searchKey) {
                    lowerBound = mid + 1;
                } else {
                    upperBound = mid - 1;
                }
            }
        }
    }

    //    ===========================================================
    public void insert(double value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] > value)
                break;
        }
        for (int k = nElems; k < j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElems++;
    }

    //    ===========================================================
    public boolean delete(double value) {
        int j = find(value);
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
        }
        nElems--;
        return true;
    }

    //    ===========================================================
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}
