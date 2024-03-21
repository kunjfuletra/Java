package comparearray;
import java.util.*;

public class comparearray {

	public static void main(String[] args) {

		 	int[] arr1 = {1, 2, 3};
	        int[] arr2 = {1, 2, 3};
	        
	        System.out.println("Array 1 :" +Arrays.toString(arr1));
	        System.out.println("Array 1 :" +Arrays.toString(arr2));
	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println("Arrays are equal");
	        } else {
	            System.out.println("Arrays are not equal");
	        }
	}

}





