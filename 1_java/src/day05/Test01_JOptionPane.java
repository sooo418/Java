package day05;

import javax.swing.JOptionPane;

public class Test01_JOptionPane {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("이릅을 입력해 주세요 !");
		System.out.println(data);

		String jumsu = JOptionPane.showInputDialog("국어/영어/수학 점수를 입력해주세요(90/90/77)");
		System.out.println(jumsu);
		int sum = 0;
		for (int i = 0; i < jumsu.split("/").length; i++) {
			sum += Integer.parseInt(jumsu.split("/")[i]);

		}
		System.out.println(sum/jumsu.split("/").length);
		//jumsu.split("/")은 /단위로 쪼개 배열을 생성

	}

}
