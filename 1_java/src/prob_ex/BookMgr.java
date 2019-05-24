package prob_ex;

public class BookMgr {
	private Book[] bookList;
	private int count = 0;

	public BookMgr() {
		bookList = new Book[3];//배열초기화
	}

	public void addBook(Book book) {
		if (count == bookList.length) {
			Book[] temp = new Book[bookList.length * 2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			//(원본 배열주소, 복사할 첫 번째, 복사받는 배열주소, 받을 첫 번쨰, 길이) 
			bookList = temp;
		}
		if (book != null) {
			this.bookList[count] = book;
			this.count++;
		}
	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
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
