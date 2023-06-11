import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class ComplexNumbers {
	int real, img;
	ComplexNumbers(int real, int img){
		this.real = real;
		this.img = img;
	}
	public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2){
		int r = c1.real + c2.real;
		int i = c1.img + c2.img;
		c1.real = r;
		c1.img = i;
		return c1;
	}

	public static ComplexNumbers multiply(ComplexNumbers c1, ComplexNumbers c2){
		int r = c1.real * c2.real - c1.img * c2.img;
		int i = c1.img * c2.real + c1.real * c2.img;
		c1.real = r;
		c1.img = i;
		return c1;
	}

	public static void print(ComplexNumbers c1){
		System.out.print(c1.real + " + i"+c1.img);
	}
}

class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int i1 = sc.nextInt();
		int r2 = sc.nextInt();
		int i2 = sc.nextInt();
		int option = sc.nextInt();
		ComplexNumbers c1 = new ComplexNumbers(r1, i1);
		ComplexNumbers c2 = new ComplexNumbers(r2, i2);

		switch(option){
			case 1:
				ComplexNumbers.add(c1, c2);
				ComplexNumbers.print(c1);
				break;
			case 2:
				ComplexNumbers.multiply(c1, c2);
				ComplexNumbers.print(c1);
				break;
		}
	}
}
		