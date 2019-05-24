package BookApp.Step01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BookMgr {
	Map<Integer, Book> bookList = new HashMap<Integer, Book>();
	Scanner sc = new Scanner(System.in);
	String input;
	String price;
	int count = 0;

	public BookMgr() {
	}

	public void addBook() {
		System.out.println("책 이름을 입력해주세요");
		input = sc.nextLine();
		System.out.println("책 가격을 입력해주세요");
		price = sc.nextLine();
		if (input != null && Integer.parseInt(price) > 0) {
			Book book = new Book(input, Integer.parseInt(price));
			count++;
			book.setCount(count);
			bookList.put(book.getCount(), book);
		}
	}

	public void updateBook() {
		System.out.println("수정하고 싶은 책 번호를 입력해주세요");
		input = sc.nextLine();
		System.out.println("새로 추가하고 싶은 책 이름을 입력해주세요.");
		String newinput = sc.nextLine();
		System.out.println("새로 추가하고 싶은 책 가격을 입력해주세요.");
		price = sc.nextLine();
		if (Integer.parseInt(input) > 0 && newinput != null && Integer.parseInt(price) > 0) {
			Iterator<Integer> it = bookList.keySet().iterator();
			while (it.hasNext()) {
				int i = it.next();
				if (i == Integer.parseInt(input))
					it.remove();
			}
			Book book = new Book(newinput, Integer.parseInt(price));
			bookList.put(Integer.parseInt(input), book);
		}
	}

	public void deleteBook() {
		System.out.println("삭제하고 싶은 책 번호를 입력해주세요");
		input = sc.nextLine();
		if (Integer.parseInt(input) > 0) {
			Iterator<Integer> it = bookList.keySet().iterator();
			while (it.hasNext()) {
				int i = it.next();
				if (i == Integer.parseInt(input))
					it.remove();
			}
		}
	}

	public void selectBook() {
		System.out.println("검색하고 싶은 책 번호를 입력해주세요");
		input = sc.nextLine();
		if (Integer.parseInt(input) > 0) {
			System.out.println(bookList.get(Integer.parseInt(input)));
		}
	}

	public void printBookList() {
		System.out.println("****** 책목록 *******");
		bookList.forEach((Integer i, Book b) -> System.out.println("책 번호 : " + i +"   " + b));
	}

}
