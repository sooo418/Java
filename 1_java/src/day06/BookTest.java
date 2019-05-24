package day06;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("java");
		b1.setPrice(90);

		System.out.println(b1);
		b1.print();

		Book b2 = new Book();
		b2 = b1; // b2의 객체는 쓰레기 값이 됨
		System.out.println(b1.equals(b2));

	}

}
