package prob;

public class Prob2_1 {
	
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 
		System.out.println(y >= 5 || x < 0 && x > 2); //and연산이 or연산보다 우선순위가 높음    
		System.out.println( !('A' <= c && c <='Z') );     
		System.out.println('C'-c);                        
		System.out.println('5'-'0');                      
		System.out.println(c+1);   //이항연산을 실행 시 int + int형으로 변환되어서 결과 값이 정수형으로 반환                      
		System.out.println(++c);                          
		System.out.println(c++);                          
		System.out.println(c);      
	}
} 
