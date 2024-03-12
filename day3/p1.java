package day3;

public class p1 {

	public static void main(String[] args) {
		int[] numbers = {5, 12, 7, 8, 3, 10, 6};

		int Count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                Count++;
            }
        }
        System.out.println("The number of even numbers in the array is: " + Count);
    }
}


