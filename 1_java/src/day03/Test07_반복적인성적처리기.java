package day03;

import java.util.Scanner;

public class Test07_반복적인성적처리기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("성적처리 Application 시작하려면 yes를 입력하세요");
			System.out.println("q를 입력하면 종료 됩니다.");

			String msg = input.nextLine();
			if (msg.equalsIgnoreCase("q")) {
				if (input != null) {
					input.close();
					input = null;
					System.out.println("Application stop");
					return;

				}
			}
			if (msg.equalsIgnoreCase("yes") && msg != null) {
				System.out.println("성적처리 Application start");
				System.out.println("성적을 입력하세요");
				System.out.println("국어 영어 수학 입력예)\n 90 90 90 엔터");

				int k1 = input.nextInt();
				int k2 = input.nextInt();
				int k3 = input.nextInt();
				input.nextLine();

				double m = 0.0;
				System.out.printf("국어:%d, 영어:%d, 수학:%d,", k1, k2, k3);
				System.out.printf("\t평균:%.2f\n", m = (k1 + k2 + k3) / 3.);

				char grade = ' ';
				/*
				 * if(m >= 90 && m <= 100) grade ='A'; else if(m >= 80 && m <= 90) grade ='B';
				 * else if(m >= 70 && m <= 80) grade ='C'; else if(m >= 60 && m <= 70) grade
				 * ='D'; else grade = 'F'; System.out.printf("성적처리결과: [%c] %n", grade);
				 */
				if (m >= 90 && m <= 100)
					grade = 'A';
				else if (m >= 80 && m <= 90)
					grade = 'B';
				else if (m >= 70 && m <= 80)
					grade = 'C';
				else if (m >= 60 && m <= 70)
					grade = 'D';
				else
					grade = 'F';
				System.out.printf("성적처리결과: [%c] %n", grade);
			}

		}

	}
}
