package day02;

import java.util.Scanner;

public class Test04 {
	
	public static void main(String[] args) {
		int num = 15;
		System.out.println(15%3);
		System.out.println(num++);
		
		Scanner keyboard = null;
		String msg = "hello";
		String msg2 = "hello";
		
		boolean flag = num < 15 && msg.length() > 0;
		System.out.println(flag);
		
		System.out.println(num == msg.length()); //==연산자는 기본형을 비교할 때 사용
		System.out.println(msg.equals(msg2)); //변수.equals(변수)는 레퍼런스형을 비교할 때 사용
		System.out.println(msg == msg2); //String은 세미타입이라 new키워드 없이 사용가능해서 예외적으로 true값이 됨.
		System.out.println("=================================");
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);      //false
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(4 << 2);
		System.out.println(4 >> 1);
		System.out.println(4 & 1);
		
		keyboard = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int jumsu = keyboard.nextInt();
		keyboard.nextLine();
		keyboard.close();
		keyboard = null;
		
		System.out.println("유효성 검증");
		if(!(jumsu >= 0 && jumsu <= 100)) {
			return;
		}
		System.out.println(jumsu >= 80 ? "PASS":"NO_PASS");
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); //byte타입으로 변환하지 않으면 연산은 int형으로 인식해 오류가 발생한다.
		System.out.println(c);
		
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		System.out.println(1.d == 1.f);
		
		char x= 'h';
		if(x >= 'a' && x <= 'z') //x값이 소문자인지 검사한다.
			{
			x -=32; //x값이 소문자이면 아스키값32를 차감해서 대문자값으로 바꿔준다.
		}
		System.out.println(x);
		
		System.out.println("END");
	}

}
