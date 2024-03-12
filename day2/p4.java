package day2;

public class p4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int biggest;
        biggest = num1;
        switch (biggest) {
            case 1:
                if (num2 > biggest) {
                    biggest = num2;
                }
            case 2:
                if (num3 > biggest) {
                    biggest = num3;
                }
                break;
        }

        System.out.println("The biggest number is: " + biggest);
    }
}

