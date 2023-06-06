package Day.Day5_Storing_Objects_Array;

public class ClassDataArray {
    Person[] person;
    int nElements = 0;

    public ClassDataArray(int max) {
        //constructor
        person = new Person[max];
        nElements = 0;
    }

    //    =======================================
    public boolean find(String searchName) {
        int i = 0;
        for (i = 0; i < nElements; i++) {
            if (person[i].getPersonsName().equals(searchName)) {
                break;
            }
        }
        return i != nElements;
    }

    //    =========================================
    public void insert(Person p) {
        person[nElements] = new Person(p.firstName, p.lastName, p.age);
        nElements++;
        System.out.println("Person added successfully!");
    }

    //    =======================================
    public void delete(String fullName) {
        int i = 0;
        for (i = 0; i < nElements; i++) {
            if (find(fullName))
                break;
        }
        if (i == nElements) {
            System.out.println("This name doesn't exist");
        } else {
            for (int k = i; k < nElements; k++) {
                person[k] = person[k + 1];
            }
            nElements--;
            System.out.println("Deleted successfully!");
        }
    }

    //    ============================================================
    public void display() {
        for (int j = 0; j < nElements; j++) {
            person[j].displayPerson();
            System.out.println("=================================");
        }
    }
//    =============================================================
}
