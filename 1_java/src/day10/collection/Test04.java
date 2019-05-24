package day10.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * Set<String> set = new TreeSet<String>(); set.add("hello1");
		 * set.add("hello3"); set.add("hello9"); set.add("hello2"); set.add("hello3");
		 * set.add("hello5"); set.add("hello6"); System.out.println(set);
		 */
		// HashSet은 중복만 잡아줄 수 있고 TreeSet은 중복과 순서도 잡아주는 기능을 한다.
		Set<Book> set = new TreeSet<Book>();
		set.add(new Book("java", 900));
		set.add(new Book("sql", 190));
		set.add(new Book("dB", 90));
		set.add(new Book("spring", 490));
		set.add(new Book("spring", 490));
		set.add(new Book("sql", 190));
		set.add(new Book("sql", 190));
		set.add(new Book("sql", 190));
		System.out.println(set);

		// for(Book data:set) {
		// System.out.println(data);
		// }
		Iterator<Book> it = set.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			// System.out.println(book);
			if (book.getTitle().equalsIgnoreCase("spring")) {
				it.remove();
			}
		}
		System.out.println(set);
	}
}
