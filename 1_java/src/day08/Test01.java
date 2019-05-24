package day08;

import static java.lang.Math.PI;
import static java.lang.Math.*;

public class Test01 {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println(random());
		
		Dog d = new Dog("시베리안 허스키", "캐리");
		Fish f = new Fish("쿠피");

		exec(f);
		exec(d);
	}

	public static void exec(Animal a) {
		a.breath();
		a.print();
	}
}
