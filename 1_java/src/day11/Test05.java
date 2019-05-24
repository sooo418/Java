package day11;

import java.util.ArrayList;
import java.util.List;
import prob_ex09.Book09;

public class Test05 {
	public static void main(String[] args) {
		List<Book09> books= new ArrayList<Book09>();
		books.add(new Book09("java", 500));
		books.add(new Book09("sql", 5200));
		books.add(new Book09("servlet&jsp", 2500));
		books.add(new Book09("html5", 1500));
		books.add(new Book09("java", 500));
		books.add(new Book09("java", 500));
		
		books.forEach(i->System.out.println(i.getTitle().charAt(0)+"**"));
		books.stream().forEach(i->System.out.println(i));
		System.out.println("================================");
		books.stream().distinct().forEach(i->System.out.println(i));
		
		
	long count = books.stream().filter(i->i.getPrice()>1500).count();
	System.out.println(count);	
	
	int sum = books.stream().mapToInt(i->i.getPrice()).sum();
	System.out.println(sum);
	
	}
}
