package Topic.Sorting;

public class ArrayInObj {
    Person[] person;
    int nElems;
//    ==============constructor=================
    public ArrayInObj(int max){
        person = new Person[max];
        nElems = 0;
    }
//    ================insert====================
    public void insert(String firstName, String lastName, int age){
        person[nElems] = new Person(firstName, lastName, age);
        nElems++;
    }
//    =================display==================
    public void display(){
        for(int i=0; i<nElems; i++){
            person[i].displayPerson();
            System.out.println("=======================");
        }
    }
//    ==============insertionSort===============
    public void insertionSort(){
        int in, out;
        for(out = 1; out<nElems; out++){
            Person temp = person[out];
            in = out;
            while (in > 0 && person[in-1].getFullName().compareTo(temp.getFullName()) > 0){
                person[in] = person[in-1];
                --in;
            }
            person[in] = temp;
        }
    }
}