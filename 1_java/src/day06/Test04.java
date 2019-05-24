package day06;

public class Test04 {
	public static void main(String[] args) {
		System.out.println("start ...");
		BlockTest b = new BlockTest();
		System.out.println("-----------");
		BlockTest c = new BlockTest();
		
		System.out.println("end ...");
	}
}

class BlockTest{
	
	static {//클래스초기화블럭
		System.out.println("static 초기화 {  }");
	}
	
	{//인스턴스초기화블럭
		System.out.println("초기화 {  }");
	}
	
	public BlockTest() {
		System.out.println("BlockTest() 생성자 ..");
	}
}