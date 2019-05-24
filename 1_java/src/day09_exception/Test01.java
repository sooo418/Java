package day09_exception;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("start");
		String num = JOptionPane.showInputDialog("숫자를 입력하세요..");
		try {
			System.out.println(1);
			System.out.println(4./Integer.parseInt(num)); //예외발생
			System.out.println(2);	//예외가 발생해서 catch부로 넘어가기 때문에 처리안됨
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나누면 안됨 ...");
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("문자는 안되요.. 숫자만 입력해주세요");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println(9);
		}
	
		System.out.println("end");
	}
}
