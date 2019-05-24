package prob;

public class Account {
	private Person owner;
	private int balance;

	public void setAccount(Person owner) {
		this.owner = owner;
	}

	public Person getAccount() {
		return owner;
	}

	public void setBalance(int balance) {
		if (balance >= 0)
			this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int a) {
		this.balance += a;
		System.out.printf("계좌에 %d원을 입금하였습니다. %n", a);
		System.out.printf("현재 잔액: %d %n", this.balance);
	}

	public void withdraw(int a) {
		if (balance < a)
			System.out.println("잔액이 부족합니다.");
		this.balance -= a;
		System.out.printf("계좌에서 %d원을 출금하였습니다. %n", a);
		System.out.printf("현재잔액: %d %n", this.balance);
	}

	public boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(), amount);
	}

	public boolean transfer(Account to, int amount) {
		if (amount < 0 || amount > balance)
			System.out.println("계좌이체에 실패하였습니다");
		balance -= amount;
		to.balance += amount;
		System.out.printf("%s님에게 %d원을 송금했습니다. 잔액:%d\n", to.owner.getName(), amount, balance);
		return true;
	}
	public void information() {
		System.out.println("통장정보출력==============================");
		System.out.printf("계좌번호:%s\n", owner.getAccount_num());
		System.out.printf("계좌주 이름:%s\n", owner.getName());
		System.out.printf("계좌주 나이:%d\n", owner.getAge());
		System.out.printf("통장 금액:%d\n", this.balance);
	}

}
