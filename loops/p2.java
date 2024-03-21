package loops;

public class p2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        int c = 20;
        if (a > b && a > c) {
            System.out.println("a is biggest");
        } else if (b > c && b > a) {
            System.out.println("b is biggest");
        } else {
            System.out.println("c is biggest");
        }

    }
}
