package searchAlgorithms;

public class LinearSearch {

	int nums[] = new int[50];

	public static int search(double arr[], double key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
