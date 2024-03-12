package day5;

import java.util.Scanner;
public class taxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        
        if (age <= 18) {
            System.out.println("Tax is not applicable for age 18 or younger.");
            return;
        }

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        scanner.close();

        double taxRate = 0.0;
        if (income > 50000 && income < 80000) {
            taxRate = 0.10; 
        } else if (income >= 80000 && income < 100000) {
            taxRate = 0.20; 
        } else {
            System.out.println("No tax applicable for this income range.");
            return;
        }

        double taxAmount = income * taxRate;
        System.out.println("Tax amount to be paid: " + taxAmount);
    }
}
