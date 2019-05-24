package prob;

public class Prob3_소현우 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		StringBuilder sb = new StringBuilder();
		char c = ' ';
		for (int i = 0; i < sourceString.length(); i++) {
			c = sourceString.charAt(i);
			if (c != ' ' && c + 3 <= 122) 
				sb.append((char) (c + 3));
			else if (c == ' ')
				sb.append(c);
			else if (c + 3 > 122)
				sb.append((char) (c + 3 - 26));

		}
		String encodedString = sb.toString();
		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		// 프로그램 구현부 끝.

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}
