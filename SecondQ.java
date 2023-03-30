package lectures_codes;

public class SecondQ {

	public static void main(String[] args) {
		        int even = 0 , odd=0;

		        for (int num = 1; num <= 50; num++) {
		            if (num % 2 == 0) {
		              even++;
		            } else {
		               odd++ ;
		            }
		        }

		        System.out.println("Even numbers count: " + even);
		        System.out.println("Odd numbers count: " +odd );
		    }
		}
