package progrmmers.level2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

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

	public String solution_stream(String number, int k) {
		StringBuilder answer = new StringBuilder(number);

		for (int i = 0; i < k; i++) {
			AtomicInteger current = new AtomicInteger();
			boolean deleteCheck = IntStream.range(current.get(), answer.length() - 1)
					.filter(j -> {
						if (j > 0) current.set(j - 1);
						return answer.charAt(j) < answer.charAt(j + 1);
					})
					.findFirst()
					.isPresent(); // OptionalInt 대신 isPresent()를 사용합니다.

			if (deleteCheck) {
				int j = IntStream.range(current.get(), answer.length() - 1)
						.filter(index -> answer.charAt(index) < answer.charAt(index + 1))
						.findFirst()
						.getAsInt(); // getAsInt()를 사용해 정수형으로 변환합니다.
				answer.deleteCharAt(j);
			} else {
				IntStream.range(0, k - i)
						.forEach(index -> answer.deleteCharAt(answer.length() - 1));
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

		String solution2 = bigNumber.solution_stream(number, 4);
		System.out.println("solution2 = " + solution2);
	}
}
