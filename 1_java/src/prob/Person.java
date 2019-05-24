package prob;

public class Person {
	private String name;
	private int age;
	private Account account;
	private String account_num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public boolean transfer(Person to, int amount) {
		return account.transfer(to.getAccount(), amount);
	}

	public boolean transfer(Account to, int amount) {
		return account.transfer(to, amount);
	}

}
