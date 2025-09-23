package ab47;

public class ThisKeyword {
	String name;
	int age;
	double salary;

	void student_details(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public static void main(String[] args) {
		ThisKeyword t1 = new ThisKeyword();
		t1.student_details("Prasad", 38, 250000);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);

	}

}
