package src;

public class Student {
	double Mark1;
	double Mark2;
	double Mark3;
	double Mark4;
	double Mark5;
	double avg;
	public double Average() {
		avg =(Mark1+Mark2+Mark3+Mark4+Mark5)/5;
		return avg;
	}
	public void classifyAverage() {

		if (avg >= 90 && avg <= 100) {
			System.out.println("your classify avarage is   A");
		} else if (avg >= 80 && avg < 90) {
			System.out.println("your classify avarage is   B");
		} else if (avg >= 70 && avg < 80) {
			System.out.println("your classify avarage is   C");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("your classify avarage is   D");
		} else if (avg >= 50 && avg < 60) {
			System.out.println("your classify avarage is   E");
		} else {
			System.out.println("your classify avarage is   F");
		}
	}

}
