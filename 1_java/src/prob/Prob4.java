package prob;

import java.util.Arrays;

public class Prob4 {
	public static void main(String[] args) {
		int[] num = new int[6];

		// 중복처리데이터 초기화
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 6) + 1;
			for (int j = 9; i > j; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}
			}
			System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(num));

		int count = 0;
		for (int i = 0; i < num.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[min] > num[j]) {
					min = j;
				}
			}
			if(i!=min) {
				int temp = num[i];
				num[i] = num[min];
				num[min] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println(count);
	}

}
