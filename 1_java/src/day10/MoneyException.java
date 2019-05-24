package day10;

public class MoneyException extends Exception{
	//Exception은 checked exception이라 try문 처리가 필요
	//RuntileException은 unchecked exception이라 try문 처리가 필요X
	public MoneyException() {
		super("MoneyException : 금액 확인 필요 ");
	}
	public MoneyException(String msg) {
		super(msg);
	}
}
