package level2;

/*
programmers
level: 2
title: 큰 수 만들기
url: https://programmers.co.kr/learn/courses/30/lessons/42883
*/
public class BigNumber {
	public String solution(String number, int k) {
		StringBuilder answer = new StringBuilder(number);

		int current = 0;
		for (int i = 0; i < k; i++) {
			boolean deleteCheck = false;
			for (int j = current; j < answer.length() - 1; j++) {
				if (j > 0) current = j - 1;
				// 다음 index 숫자와 비교 후 다음 수가 더 큰 경우 현재 수 제거
				if (answer.charAt(j) < answer.charAt(j + 1)) {
					answer.deleteCharAt(j);
					deleteCheck = true;
					break;
				}
			}

			// 순회 후 데이터가 제거되지 않은 경우, 맨 뒤 숫자 차례대로 제거
			if (!deleteCheck) {
				for (int j = 0; j < k - i; j++) {
					answer.deleteCharAt(answer.length() - 1);
				}
				break;
			}
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		String number = "98721314";
		int k = 3;
		BigNumber bigNumber = new BigNumber();
		String solution = bigNumber.solution(number, 4);
		System.out.println("solution = " + solution);
	}
}
