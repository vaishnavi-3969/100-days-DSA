package Topic.Sorting;

public class Person {
    private String firstName, lastName;
    int age;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
//    ============================================================
    public void displayPerson(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
//    ================================================================
    public String getFullName(){
        return firstName + " " +lastName;
    }
//    ==============================================================
}
