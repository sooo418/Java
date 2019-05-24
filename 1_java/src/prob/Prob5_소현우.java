package prob;

public class Prob5_소현우 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("소현우");
		p1.setAge(25);
		p1.setAccount_num("302-0818-3525-81");
		
		Account a1 = new Account();
		a1.setBalance(100000);
		
		p1.setAccount(a1);
		a1.setAccount(p1);
		
		Person p2= new Person();
		p2.setName("홍길동");
		p2.setAge(25);
		p2.setAccount_num("686602-01-276431");
		
		Account a2 = new Account();
		a2.setBalance(50000);
		
		p2.setAccount(a2);
		a2.setAccount(p2);
		
		a1.information();
		a2.information();

		a1.transfer(a2, 20000);
		
		a1.information();
		a2.information();

	}

}
