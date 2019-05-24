package day02;

import java.util.Scanner;

public class Test03_Scanner {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//키보드로부터 입력받음
		System.out.print("이름을 입력하세요_");
		System.out.println();
		String name = keyboard.nextLine();//name이라는 문자열 변수에 키보드로부터 입력받은 값을 저장.
		System.out.print("나이를 입력하세요_");
		System.out.println();
		int age = Integer.parseInt(keyboard.nextLine());//age라는 변수에 입력받은 문자값을 정수형으로 변환하여 저장.
		
		System.out.println("국어/영어/수학 점수를 입력하세요_");
		System.out.println("입력예)90 90 70 처럼 점수를 입력 후 엔터");
		
		int k1 = keyboard.nextInt();
		int k2 = keyboard.nextInt();
		int k3 = keyboard.nextInt();
		keyboard.nextLine(); //nextInt()사용 시 nextLine()으로 엔터키 값을 처리
		
		System.out.println("**** 입력정보 확인 ****");
		System.out.printf("[이름:%s , 나이:%d]%n", name, age);
		System.out.printf("[국어:%s 영어:%s 수학:%s 평균:%.2f] %n", k1, k2, k3, (k1+k2+k3)/3.);
		System.out.println("**** 입력정보 확인 ****");
		
		keyboard.close();//자원반납
		keyboard = null; //null으로 자원반납x
		
	}

}
