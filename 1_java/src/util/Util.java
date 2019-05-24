package util;

public class Util {

	public static int[] sort(int[] n) {
		int[] a = n.clone(); //배열n을 복사해서 배열a에 대입
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		return a;
	}
}
