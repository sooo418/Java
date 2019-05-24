package day02;

import java.util.Date;

public class Test01 {
	int d; //class variable - default 값이 자동으로 지정.
	public static void main(String[] args) {
		int i = 6; //local variable - 명시적인 값을 지정해줘야 한다.
		i = 4;
		System.out.println(i);
		Date d = new Date(); //Date는 reference data-d라는 기억장소에 주소값이 지정됨.
		System.out.println(d.toLocaleString());//그어진 줄은 옛날에 쓰여진 방식으로 지금은 쓰지않는것을 권함.
		d = null; //d는 null으로 가리키는 값이 없어져서 힙에 저장된 기존 data값은 쓰레기 값이 됨.
		
		String ss = new Date().toString();
		System.out.println(ss);
		
		double pi = Math.PI;
		double r = Math.random();
		int r1 = (int)(Math.random()*45+1);
		System.out.printf("pi:%.4f, r:%.2f, r1:%d %n", pi,r,r1);
		
		
		String s1 = new String("hello"); //new키워드가 들어가면 힙영역 메모리로 적재됨.
		String s2 = "hello"; //다른 변수에도 같은 문자값이 입력 시 같은 기억장소를 사용
		
	}

}
