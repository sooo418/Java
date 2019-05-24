package prob07;

public class Teacher extends Person {

	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (subject != null && subject.length() > 0)
			this.subject = subject;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("[Teacher ] 담당과목 : %s\n", this.getSubject());
	}
}
