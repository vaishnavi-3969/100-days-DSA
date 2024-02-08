package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Is the no. even: "+isEven(n));
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static boolean isComplexPassword(String password){
        return password.length() >=6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
    }

}