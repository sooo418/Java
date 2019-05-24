package day07;

public class Test03 {
	public static void main(String[] args) {
		Dog d = new Dog("시베리안허스키", "캐리");
		d.print();

		d.breath();
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind); // d객체의 부모클래스의 kind에 접근(업캐스팅)
		System.out.println("----------------------------");

		Object a = new Dog("시베리안허스키", "캐리");
		if (a instanceof Animal) //Object객체가 Animal객체로 변환가능한지 검사
			System.out.println(((Animal) a).kind);
		if (a instanceof Dog)
			System.out.println(((Dog) a).kind);

		if (a instanceof String)
			System.out.println(((String) a).toString());
	}
}
