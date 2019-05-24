package day06;

public class Account {
//		계좌번호, 잔고, 입금, 출금, 계좌이체, 통장정보출력
	private String number;
	private int money;

	public Account() {
		this("000", 0);
		//this.setNumber("000");
		//this.setMoney(money);
	}

	public Account(String number, int money) {
		this.setNumber(number);
		this.setMoney(money);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money > 0)
			this.money = money;
	}

	// 입금
	public void input(int money) {
		if (money > 0)
			this.money += money;
		// return;이 생략되어있음
	}

	// 출금
	public int output(int money) {
		if (this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고 부족");
		return 0;
		// return;이 생략되어도 함수가 int타입이라 정수형의 타입을 반환해야한다.
	}

	// 계좌이체
	/**
	 * 
	 * @param from  송금통장
	 * @param to    수금통장
	 * @param money 송금금액
	 */
	public static void transfer(Account from, Account to, int money) {
		int t = from.output(money);
		to.input(t);
		// to.input(from.output(money));
	}

	// 통장정보출력
	public void print() {
		System.out.printf("Account[통장번호:%20s, 잔고: %d원]%n", number, money);
	}

}
