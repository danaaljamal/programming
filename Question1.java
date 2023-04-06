package lectures_codes;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {15,50,26,19,4,28,90,100,5,7,20,35};
		 int biggest = biggest(arr1);
		    System.out.println("The largest number in the array is " + biggest);
		int smallest = findSmallest(arr1);
		    System.out.println("The smallest number in the array is " + smallest);   
		  int secondLargestIndex = findSecondLargest(arr1);
		    System.out.println("The index of the second biggest number in the array is " + secondLargestIndex);
		    swapSecondWithLast(arr1); 
		    System.out.println(arr1.toString(arr1));		
	}   
		
	

	static int biggest(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
        }
    }
    return max;
}
	 static int findSmallest(int[] arr) {
		    int min = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] < min) {
		            min = arr[i];
		        }
		    }
		    return min;
		}
	 static int findSecondLargest(int[] arr) {
		    int largestInd = 0;
		    int secondLargest = 2;
		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] > arr[largestInd]) {
		            secondLargest = largestInd;
		            largestInd = i;
		        } else if (arr[i] < arr[largestInd]) {
		           if (secondLargest == 2 || arr[i] > arr[secondLargest]) {
		                secondLargest = i;
		            }
		        }
		    }
		    return secondLargest;
	 }
	 static void swapSecondWithLast(int[] arr) {
			int[] arr1 = {15,50,26,19,4,28,90,100,5,7,20,35};
	 if (arr.length < 2) {
	        System.out.println("Array must have at least 2 elements");
	        return;
	 int temp = arr[1];
     arr[1] = arr[arr.length-1];
     arr[arr.length-1] = temp;
    
	    }}
	  
}
