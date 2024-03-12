package day3;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (!str.isEmpty()) {
            char firstChar = str.charAt(0);
            char newchar = Character.isUpperCase(firstChar) ? Character.toLowerCase(firstChar) : Character.toUpperCase(firstChar);
            System.out.println("The first character of the string with changed case is: " + newchar);
        } else {
            System.out.println("Input string is empty.");
        }
        scanner.close();
    }
}
