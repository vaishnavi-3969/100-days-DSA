package Topic.Sorting;

public class Algorithms {
    double[] a;
    int nElements;
//    =================================
    public Algorithms(int max){
        a = new double[max];
        nElements = 0;
    }
//    ====================================
    public void insert(double value){
        a[nElements] = value;
        nElements++;
    }
//    ===================================
    public void display(){
        for (int i =0; i<nElements; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
//    =====================================
    public void bubbleSort(){
        int out, in;
        for(out = nElements - 1; out> 1; out--){ //outer loop backward
            for(in = 0; in<out; in++){ //inner loop forward
                if(a[in] > a[in + 1]){
                    swap(in, in + 1);

                }
            }
        }
    }
//    =======================================
    public void insertionSort(){
        int in, out;
        for(out=1; out<nElements; out++){
            double temp = a[out];
            in = out;
            while (in>0 && a[in - 1] >=temp){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    private void swap(int one, int two) {
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
