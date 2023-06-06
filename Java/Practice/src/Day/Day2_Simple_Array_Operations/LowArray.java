package Day.Day2_Simple_Array_Operations;

public class LowArray {
    double[] a;

    //constructor
    public LowArray(int size) {
        a = new double[size];
    }

    //put element into array
    public void setElem(int index, double value) {
        a[index] = value;
    }

    public double getElem(int index) {
        return a[index];
    }
}
