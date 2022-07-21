package practice.coding;

import java.util.Arrays;

public class Test2 {
	public int[] solution(int[] price) {
		int[] answer = new int[price.length];
		// answer 배열 -1 초기화
		Arrays.fill(answer, -1);

		// 데이터 차례대로 다음 날짜 주가와 비교
		for (int i = 0; i < price.length - 1; i++) {
			for (int j = i + 1; j < price.length; j++) {
				// 가장 처음 기존 주가보다 큰 주가가 나오는 경우
				if (price[i] < price[j]) {
					answer[i] = j - i;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
//		int[] price = {4, 1, 4, 7, 6};
//		int[] price = {13, 7, 3, 7, 5, 16, 12};
		int[] price = {0, 5, 4, 3, 4, 6, 1};
		int[] solution = test2.solution(price);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
