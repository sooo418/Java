package day03;

public class Test06_구구단 {

	public static void main(String[] args) {
		System.out.println("****  구구단  ****");
	OUT:for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				//if(j == 5) break;
				//if(j == 5) continue;
				if(j == 5) break OUT;
				
				System.out.printf("%d*%d=%2d|", j, i, i*j);
			}
			System.out.println();
		}
		
	}

}