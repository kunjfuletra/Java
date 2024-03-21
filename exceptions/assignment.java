
// Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
package exceptions;

import java.util.Scanner;

public class assignment {

	static void method(int n) {
		if (  (n%2)!=0   ) {
//			System.out.println("Number is odd");
			throw new ArithmeticException("Number is odd");
			
		}
		else {
			System.out.println("Number is even");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any integer : ");
		int n = sc.nextInt();
		method(n);
		
		
	}

}
