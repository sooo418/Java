package prob_ex09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookMgr09 {
	private Book09[] bookList;
	private int count = 0;

	public BookMgr09() {
		bookList = new Book09[3];// 배열초기화
		Scanner sc = null;
		try {
			sc = new Scanner(new File("c://lib/bookdata.txt"));
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] bookdata = data.split("/");
				addBook(new Book09(bookdata[0], Integer.parseInt(bookdata[1])));
			}
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일 확인 필요");
		} catch (Exception e) {

		} finally {
			if (sc != null)
				sc.close();
		}
	}

	public void addBook(Book09 book) {
		if (count == bookList.length) {
			Book09[] temp = new Book09[bookList.length * 2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			// (원본 배열주소, 복사할 첫 번째, 복사받는 배열주소, 받을 첫 번쨰, 길이)
			bookList = temp;
		}
		if (book != null) {
			for (int i = 0; i < count; i++) {
				if (book.equals(bookList[i])) {
					System.out.print(book.getTitle());
					System.out.println("은 이미 등록된 책입니다.");
					return;
				}
			}
			this.bookList[count] = book;
			this.count++;
		}

	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i]);
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		System.out.println("=== 책 가격의 총합 ===");
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.printf("모든 책의 가격은 %d원입니다\n", sum);
	}
}
