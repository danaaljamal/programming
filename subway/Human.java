package subway;

public class Human {
	private String gender;
	private int age;

	public Human(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}

	public void run() {
		System.out.println("The human is running.");
	}

	// Getters and setters
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
