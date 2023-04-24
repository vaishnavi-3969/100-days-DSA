package Day.Day5_Storing_Objects_Array;

import java.util.Scanner;

public class ClassDataApp {
    public static void main() {
        System.out.println("~~~---~~~---~~~---~~~---~~~---(START OF DAY-5)---~~~---~~~---~~~---~~~---~~~");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max. size of the array: ");
        int MAXSIZE = scanner.nextInt();
        ClassDataArray cda = new ClassDataArray(MAXSIZE);
        int n = 0;
        do {
            System.out.println("""
                    What operation you wish to perform:\s
                    1. Insert a person
                    2. Delete a person
                    3. Search for a person
                    4. Display list of all
                    0. Exit""");
            n = scanner.nextInt();
            switch (n) {
                case 0:
                    System.out.println("Done with basic array operation by storing objects in the array");
                    break;
                case 1:
                    System.out.println("----------------Insert Operation----------------");
                    System.out.println("Enter first name: ");
                    String firstname = scanner.next();
                    System.out.println("Enter last name: ");
                    String lastname = scanner.next();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    Person newPerson = new Person(firstname, lastname, age);
                    cda.insert(newPerson);
                    break;
                case 2:
                    System.out.println("----------------Delete Operation----------------");
                    System.out.println("Enter first name: ");
                    firstname = scanner.next();
                    System.out.println("Enter last name: ");
                    lastname = scanner.next();
                    cda.delete(firstname.concat(" " + lastname));
                    break;
                case 3:
                    System.out.println("----------------Search Operation----------------");
                    System.out.println("Enter first name: ");
                    firstname = scanner.next();
                    System.out.println("Enter last name: ");
                    lastname = scanner.next();
                    if (cda.find(firstname + " " + lastname))
                        System.out.println("Person Found!");
                    else
                        System.out.println("Person not found!");
                    break;
                case 4:
                    System.out.println("----------------Display Operation----------------");
                    cda.display();
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        } while (n != 0);
        System.out.println("~~~---~~~---~~~---~~~---~~~---(START OF DAY-5)---~~~---~~~---~~~---~~~---~~~");
    }
}
