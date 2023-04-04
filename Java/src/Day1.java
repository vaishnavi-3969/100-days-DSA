import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Day1 {
    static Scanner scanner = new Scanner(System.in);
/*    -----------------------------
    primitive data types:
    1. byte: -128 to 128
    2. short: (2^16/2) to (2^16/2 - 1)
    3. int: 2^32/2 to 2^32/2 - 1
    4. float:
    5. long: 2^64/2 to 2^62/2 -1
    6. double:
    7. char: 0 to 65535(2^16-1)
    8. Boolean: true/false; default: false
    ------------------------------
 */
    public void day1() {
        System.out.println("~~~---~~~---~~~---~~~---~~~---(START OF DAY-1)---~~~---~~~---~~~---~~~---~~~");
        int n = 1;
        do{
            System.out.println("------MENU-----\n");
            System.out.println("""
                    1. Addition of 3 nos.
                    2. Percentage Calculator
                    3. Percentage Calculator with modification
                    4. Check if the entered no. is integer
                    5. Greet the guest!""");
            System.out.println("Enter your choice: ");
            n = scanner.nextInt();
            switch (n) {
                case 1 -> add();
                case 2 -> percentageCalc();
                case 3 -> percentageCalculator();
                case 4 -> isInteger();
                case 5 -> greet();
                default -> {
                    System.out.println("Invalid no.!");
                    n = scanner.nextInt();
                }
            }
            System.out.println("Do you wish to continue? 0.Exit 1. Continue");
            n = scanner.nextInt();
        }while (n!=0);
        System.out.println("~~~---~~~---~~~---~~~---~~~---(END OF DAY-1)---~~~---~~~---~~~---~~~---~~~");
    }
    //    write a java program to add 3 nos.
    public static void add(){
        System.out.println("Enter first no.: ");
        int a = scanner.nextInt();
        System.out.println("Enter second no.: ");
        int b = scanner.nextInt();
        System.out.println("Enter third no.: ");
        int c = scanner.nextInt();
        System.out.println("The addition of "+ a + ", "+b+" and "+c+" is: ");
        System.out.println(a+b+c);
    }
//calculate percentage and also checks validations
    public static void percentageCalculator() {
        int sum = 0;
        int marks = 0;
        for(int i = 0; i< 6; i++){
            System.out.println("Enter marks of subject "+(i+1)+":");
            marks = scanner.nextInt();
            do{
                if(!validation(marks)){
                    System.out.println("Entered value is incorrect! Re-enter marks of subject "+(i + 1));
                    marks = scanner.nextInt();
                }
            }while(!validation(marks));
            sum = sum + marks;
        }
        System.out.println("Total Percentage: "+(sum/6)+"%");
    }
    public static boolean validation(int marks){
        return marks < 100 & marks > 0;
    }

    //    percentage calculator
    public static void percentageCalc(){
        System.out.println("Enter the marks of subject 1(Out of 100): ");
        int subject1 = scanner.nextInt();
        System.out.println("Enter the marks of subject 2(Out of 100): ");
        int subject2 = scanner.nextInt();
        System.out.println("Enter the marks of subject 3(Out of 100): ");
        int subject3 = scanner.nextInt();
        System.out.println("Enter the marks of subject 4(Out of 100): ");
        int subject4 = scanner.nextInt();
        System.out.println("Enter the marks of subject 5(Out of 100): ");
        int subject5 = scanner.nextInt();
        System.out.println("Enter the marks of subject 6(Out of 100): ");
        int subject6 = scanner.nextInt();
        if(subject1>100 || subject2 > 100 || subject3 > 100 || subject4 > 100 || subject5 > 100 || subject6 > 100){
            System.out.println("Invalid Marks entered!");
        }else{
            System.out.println("Percentage: ");
            System.out.println(((subject1 + subject2 + subject3 + subject4 + subject5 + subject6)/6)+"%");
        }
    }
//    check if the entered no. is integer
    public static void isInteger(){
        System.out.println("Enter a number: ");
        try{
            String input = scanner.next();
            int n = Integer.parseInt(input);
            System.out.println("The entered no. is an integer");
        }catch (Exception e){
            System.out.println("The entered number is not an integer!");
        }
    }
//    write a java program which asks the user to enter his/her name and greets them
    public void greet(){
        System.out.println("Enter your name: ");
        String name = scanner.next();
        String initial = String.valueOf(toUpperCase(name.charAt(0)));
        name = initial + name.substring(1);
        System.out.println("Hello! "+name+". Have a nice day! :)");
    }
}
