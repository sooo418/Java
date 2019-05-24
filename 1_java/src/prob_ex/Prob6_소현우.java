package prob_ex;

public class Prob6_소현우 {

	public static void main(String[] args) {
		Book b1 = new Book("Java Program", 26400);
		Book b2 = new Book("JSP Program", 26400);
		Book b3 = new Book("SQL Fundamentals", 26400);
		Book b4 = new Book("JDBC Program", 26400);
		Book b5 = new Book("EJB Program", 26400);
		
		BookMgr mgr = new BookMgr();//객체 함수를 사용하기위해 인스턴스화
		mgr.addBook(b1);
		mgr.addBook(b2);
		mgr.addBook(b3);
		mgr.addBook(b4);
		mgr.addBook(b5);
		System.out.println(b2.equals(b4));
		
		mgr.printBookList();
		mgr.printTotalPrice();
	}

}