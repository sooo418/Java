package prob07;

public class Test01 {

	public static void main(String[] args) {
		Person s = new Student("홍길동", 20, 200201);
		Person t = new Teacher("이순신", 30, "JAVA");
		Person e = new Employee("유관순", 40, "교무과");

		System.out.println("[출력값]");
		Test01.personPrint(s);
		Test01.personPrint(t);
		Test01.personPrint(e);
	}

	public static void personPrint(Person s) {
		s.print();
	}
}
