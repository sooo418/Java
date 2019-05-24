package prob;

import java.util.Scanner;

public class Prob2_소현우 {
	public static void main(String[] args) {
/*
  변수 num의 값에따라  양수 음수  0을 출력하는  코드를 완성하세요.
   힌트: 삼항연산자.
*/
	int num = -90;
	System.out.printf("%d => ", num);
	System.out.println(num < 0 ? "음수" : (num == 0 ? "0" : "양수"));


	/*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	소문자로 변경하는 코드를 완성 합니다.
  	*/
	char ch = 'P';
	char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);


	/*  년도를 입력받아  윤년인지 판별하여 출력해  보세요 */
	Scanner keyboard = new Scanner(System.in);
	System.out.println("윤년인지 판별하고 싶은 년도를 입력하세요");
	int yy = keyboard.nextInt();
	keyboard.nextLine();
	System.out.printf("%d=>", yy);
	System.out.println((yy%400==0||(yy%4==0)&&(yy%100!=0))?"윤년":"평년");
	

	keyboard.close();
	keyboard = null;
	}
}          