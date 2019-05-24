package day01;

import java.util.Date;
//import java.sql.Date; //import는 util과 sql이 같이 표시되면 안됨

public class Sample03 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today : "+today);
		
		today = new Date();
		
		java.sql.Date d;
		System.out.println(Integer.MAX_VALUE);
		System.out.println((int)'a');
		System.out.println(Long.MIN_VALUE);
		char c = 'a';
		System.out.println(Character.isDigit/*변수안에 값이 숫자면 true*/(c));
		System.out.println(1/(int)2.);
		
	}

}