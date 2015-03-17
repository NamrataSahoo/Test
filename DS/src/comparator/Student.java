package comparator;

public class Student {
	int age;
	public Student(int age, int id, int salary) {
		super();
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int id;
	int salary;

}
