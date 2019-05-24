package day02;

public class Test02 {

	public static void main(String[] args) {
		double j = Integer.parseInt("90"); //문자형을 정수형으로 변환
		double y = Double.parseDouble("89.9"); //문자형을 실수형으로 변환
		System.out.printf("j:%5.2f, y:%5.2f \n", j, y);
		double temp;
		temp = j;
		j = y;
		y = temp;
		System.out.printf("j:%5.2f, y:%5.2f", j, y);
		
	}

}
