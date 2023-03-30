package lectures_codes;

public class FirstLap2 {

	    public static void main(String[] args) {
	        int a = 543, c;
	        while (a > 0) {
	            c = a % 10;
	            System.out.print(c);
	            a = a / 10;
	            if (a == 0)
	                break;
	        }
	        System.out.println();
	    }
	}


