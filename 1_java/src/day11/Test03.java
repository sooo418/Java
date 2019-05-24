package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Test03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(77);
		list.add(90);
		list.add(75);
		list.add(80);
		list.add(49);

		for (Integer data : list) {
			System.out.print(data + "   ");
		}
		System.out.println("\n-----------------------");
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + "   ");
			}

		});
		System.out.println("\n------------------------");
		list.forEach((Integer t) -> System.out.print(t + "   "));
		// 람다식 표현
		System.out.println("\n------------------------");

		list.forEach(t -> System.out.print(t + "   "));
		// call back 함수
		System.out.println("\n------------------------");

		list.removeIf(i -> i % 2 == 0);
		// i를 받아 i가 짝수면 제거

		list.forEach(t -> System.out.print(t + "   "));
		System.out.println("\n------------------------");
		
		/*
		list.replaceAll(new UnaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				
				return t*=10;
			}
		});
		*/
		list.replaceAll(i->i*10);
		list.forEach(t-> System.out.print(t+"   "));
	}
}
