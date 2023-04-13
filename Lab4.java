
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 15, 50, 26, 4, 19, 90, 100, 5, 7, 35 };
		int n = arr.length;
		boolean flag;
		for (int i = 0; i < n - 1; i++) {
			flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false) {
				break;
			}
		}
		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
