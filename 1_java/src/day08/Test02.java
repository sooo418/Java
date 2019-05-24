package day08;

public class Test02 {
	public static void main(String[] args) {
		
		//Animal a = new Animal(); 추상클래스는 인스턴스화X
		//Animal[] animals = new Animal[3];//타입선언은 문제없음
		Animal[] animals = {
				new Fish("쿠피"),
				new Dog("시베리안허스키", "캐리")
		};
		for(Animal a:animals) {
			exec(a);
		}
	}
	public static void exec(Animal a) {
		a.breath();
		a.print();
	}
}
