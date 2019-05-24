package day05;

public class Test02 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.color = "black";
		tv1.power();
		tv1.channelUp();
		// tv1.print();

		TV tv2 = new TV();
		tv2.color = "blue";
		// tv2.print();

		System.out.println("--------------------------------");
		//TV[] tvs = new TV[5];
		//tvs[0] = tv1; // tv1의 주소를 tvs0번지에 삽입
		//tvs[1] = tv2; // tv2의 주소를 tvs1번지에 삽입 배열은 default값으로 null값이 삽입됨.
		
		//TV[] tvs = {tv1, tv2, null, null, null};

		TV[] tvs = null;
		tvs = new TV[]{tv1, tv2, null, null, null};
		
		for (int i = 0; i < tvs.length; i++) {
			if (tvs[i] != null) tvs[i].print();
		}
	}

}
