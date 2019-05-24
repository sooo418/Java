package day05;

public class Calc {
	// + - * / // static은 힙영역에서 안올라가기 때문에 힙자원 사용시 에러발생
	public static int add(int... a) { // 가변인자는 맨뒤에 위치해야함
		int sum = 0;
		for (int data : a) {	//새로 나온 for loop방법 a의 값이 data로 가서 연산됨
			sum += data;
		}
		// for (int i = 0; i < a.length; i++) {
		// sum += a[i];
		// }
		return sum;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static double multiply(int a, int b) {
		return a * b;
	}

	public static int substract(int a, int b) {
		return a - b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
