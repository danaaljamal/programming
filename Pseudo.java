package lectures_codes;

public class Pseudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[12];
		int num1 = 0;
		int num2 = 1;
		int num=90;
		arr[0] = num1;
		arr[1] = num2;
		for (int i = 2; i < arr.length; i++) {
			num = num1 + num2;
			num1 = num2;
			num2 = num;
			arr[i] = num;
		} 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
