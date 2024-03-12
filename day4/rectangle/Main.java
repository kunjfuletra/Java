package day4.rectangle;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        
	        Area rectangle = new Area();

	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Enter length of rectangle: ");
	        double l = scanner.nextDouble();

	        System.out.print("Enter breadth of rectangle: ");
	        double b = scanner.nextDouble();


	        rectangle.setDim(l, b);

	        System.out.println("Area of rectangle is: " + rectangle.getArea());

	        scanner.close();
	    }

}
