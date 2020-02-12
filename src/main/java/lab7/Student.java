package lab7;

enum Parameter {
	NAME, AGE, ROLLNUMBER

}

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String name;
	private int age;
	private double marks;
	private String medalType;

	public String getMedalType() {
		return medalType;
	}

	public void setMedalType(String medalType) {
		this.medalType = medalType;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Student o) {
		if (o.rollNumber > rollNumber)
			return 1;
		else if (o.rollNumber < rollNumber)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("{Name:%s\nAge:%s\nRollNo:%s\nMarks:%s\nMedalType:%s}", name, age, rollNumber, marks,
				medalType);

	}

	public Student(int rollNumber, String name, int age, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

}
