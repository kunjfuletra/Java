package finddifference;

public class Main {

	public static void main(String[] args) {
		int[] arr = {23,24,23,6,2,88,55,66,66,10};
		int biggest = arr[0];

		for(int i=0;i<10;i++) {
			if(arr[i]> biggest) {
				biggest = arr[i];
			}
		}
		
		int smallest = biggest;
		System.out.println("Biggest number is= "+biggest);
		for(int i=0;i<10;i++) {
			if(arr[i]< smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest number is= "+smallest);
		int diff = biggest - smallest;
		System.out.println("Difference between smallest and biggest is =" +diff);
	}

}
