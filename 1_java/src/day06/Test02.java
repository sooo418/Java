package day06;

/**
 * 
 * @author student
 * @since 2019.04.30
 * @version 1.0
 */
public class Test02 {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setNumber("002");
		a1.setMoney(900);
		a1.print();

		Account a2 = new Account("001", 100);
		a2.print();

		Account a3 = new Account();
		a3.print();
	}

}
