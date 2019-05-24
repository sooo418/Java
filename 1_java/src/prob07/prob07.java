package prob07;

public class prob07 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신", 30, "JAVA");
		Employee e = new Employee("유관순", 40, "교무과");

		System.out.println("[출력값]");
		prob07.personPrint(s);
		prob07.personPrint(t);
		prob07.personPrint(e);
	}

	public static void personPrint(Student s) {
		s.print();
	}

	public static void personPrint(Teacher t) {
		t.print();
	}

	public static void personPrint(Employee e) {
		e.print();
	}
}
