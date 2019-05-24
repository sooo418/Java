package prob07;

public class Test02 {

	public static void main(String[] args) {
		Person[] p = { 
				new Student("박길동", 20, 200201), 
				new Student("김길동", 20, 200201), 
				new Student("홍길동", 20, 200201),
				new Employee("유관순", 40, "교무과"), 
				new Teacher("이선생", 30, "JAVA"), 
				new Teacher("한선생", 30, "SQL") 
				};
		
		System.out.println("[출력값]");

		for (Person data : p) {
			personPrint(data);
		}
		System.out.println("--------Student List -------");
		for(int i = 0; i<p.length;i++) {
			if(p[i] instanceof Student) {
				System.out.println(((Student)p[i]).getId());
				System.out.println(p[i].getName().charAt(0)+"**");
				Student s = (Student) p[i];
			}
		}
		System.out.println("----------------------------");
	}

	public static void personPrint(Person s) {
		s.print();
	}
}
