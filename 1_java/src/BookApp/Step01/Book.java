package BookApp.Step01;

import java.io.Serializable;

public class Book extends Object implements Serializable{
	private String title;
	private int price;
	private int count=0;
	
	public Book(String title, int price) {
		
		this.title = title;
		this.price = price; 
	}

	public Book() { }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null && title.length() > 0)
			this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0)
			this.price = price;
	}
	public void print() {
		System.out.printf("BOOK[제목: %s, 책 가격: %d]\n", getTitle(), getPrice());
	}
	@Override
	public String toString() {
		return "Book [title = " + title + ", price = " + price + "]"; 
	}
	/*
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj != null && obj instanceof Book09) {
			Book09 temp = (Book09)obj;
			if(title.equals(temp.title) && price == temp.price) {
				flag = true;
			}
		}
		return flag;
	}
	*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
