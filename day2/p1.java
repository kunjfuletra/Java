package day2;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int a = sc.nextInt();
        if (a>0){
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negetive");
        }
        sc.close();
    }

}
