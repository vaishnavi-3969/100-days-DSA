import java.util.*;

class Fraction {
    int numerator, denominator;

    Fraction(int num, int deno) {
        this.numerator = num;
        this.denominator = deno;
    }

    void add(Fraction f) {
        int num1 = f.numerator;
        int den1 = f.denominator;
        int newDeno = den1 * denominator;
        int newNum = numerator * den1 + num1 * denominator;
        numerator = newNum;
        denominator = newDeno;
        simplify();
        print();
    }

    void multiply(Fraction f) {
        int num = f.numerator;
        int deno = f.denominator;
        int newDeno = denominator * deno;
        int newNum = numerator * num;
        numerator = newNum;
        denominator = newDeno;
        simplify();
        print();
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    void simplify() {
        int greatestCommonDivisor = gcd(numerator, denominator);
        numerator = numerator / greatestCommonDivisor;
        denominator = denominator / greatestCommonDivisor;
    }

    void print() {
        System.out.println(numerator + "/" + denominator);
    }
}

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int deno1 = sc.nextInt();
        Fraction fraction = new Fraction(num1, deno1);
        int noOfQueries = sc.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    int num2 = sc.nextInt();
                    int deno2 = sc.nextInt();
                    Fraction f1 = new Fraction(num2, deno2);
                    fraction.add(f1);
                    break;
                case 2:
                    int num3 = sc.nextInt();
                    int deno3 = sc.nextInt();
                    Fraction f2 = new Fraction(num3, deno3);
                    fraction.multiply(f2);
                    break;
            }
        }
    }
}
