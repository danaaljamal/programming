package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.Mark1=40;
		s1.Mark2=60;
		s1.Mark3=90;
		s1.Mark4=77;
		s1.Mark5=89.55;
		s1.Average();
		s1.classifyAverage();
		Student s2= new Student();
		s2.Mark1=90;
		s2.Mark2=80;
		s2.Mark3=90;
		s2.Mark4=90;
		s2.Mark5=89.55;
		s2.Average();
		s2.classifyAverage();
		Student s3= new Student();
		s3.Mark1=90;
		s3.Mark2=96;
		s3.Mark3=95;
		s3.Mark4=98;
		s3.Mark5=89.55;
		s3.Average();
		s3.classifyAverage();
	}
}
