package day03;

public class Test08_String {
	public static void main(String[] args) {
		String msg = "hello java test !!!";
		String msg2 = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < msg.length(); i++) {
			//System.out.println(msg.charAt(i) + "=>" + (char) (msg.charAt(i) - 32));
			//msg2 += (char)(msg.charAt(i)-32);  x
			sb.append((char)(msg.charAt(i)-32)); //다른 장소에 문자를 저장해 한번에 변환
		}
		
		msg2 = sb.toString();
		
		System.out.println(msg);
		System.out.println(msg2);

		/*
		 * String name = "홍길동"; System.out.println(name);
		 * System.out.println(name.length()); System.out.println(name.charAt(0)+"**");
		 * //charAt는 name이 가리키는 값의 x번째 위치하는 문자값을 출력한다.
		 * System.out.println("**"+name.charAt(name.length()-1));
		 * System.out.println(name.substring(0, 2));
		 */
	}

}
