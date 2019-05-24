package day10.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("java");
		list.add("sql");
		list.add("hello");

		System.out.println(list.isEmpty());
		Object[] o = new Object[list.size()];
		o = list.toArray(); //list의 data를 object타입으로 불러옴

		String[] s = new String[list.size()];
		s = list.toArray(s); 
		
		System.out.println(list);
		Collections.sort(list); //List 정렬함수
		System.out.println(list);

		System.out.println("배열");
		Arrays.sort(s); //배열 정렬함수
		System.out.println(Arrays.toString(s));
		//Arrays.toString(a) a라는 배열을 출력하는 메소드
	}
}
