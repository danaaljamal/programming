package searchAlgorithms;

public class BinarySearch {
	public static int search(double[] arr, double key) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == key) {
				return mid;
			}

			if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return 0;
	}
}
