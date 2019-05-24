package day09_Inner;

class A {
	String name = "홍길동";
	
	void print() {
		new B().print(); //outer에서 접글할 때는 new키워드 필요.
	}

	class B {
		void print() {
			System.out.println(name);
		}
	}
}

public class Test01 {
	public static void main(String[] args) {
		A a = new A();
		a.print();
		
		A.B b = new A().new B();
		b.print();
	}
}
