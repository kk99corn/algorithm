package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 2개 이하로 다른 비트
url: https://programmers.co.kr/learn/courses/30/lessons/77885
*/
public class LongToBit {

	public long[] solutionStream(long[] numbers) {
		return Arrays.stream(numbers)
				.map(number -> {
					if (number % 2 == 0) {
						return number + 1;
					} else {
						StringBuilder temp = new StringBuilder();
						String binaryString = Long.toBinaryString(number);
						if (!binaryString.contains("0")) {
							temp.append("10");
							temp.append(binaryString.substring(1).replace("0", "1"));
						} else {
							int lastIndex = binaryString.lastIndexOf("0");
							int firstOneIndex = binaryString.indexOf("1", lastIndex);
							temp.append(binaryString, 0, lastIndex).append("1").append("0").append(binaryString.substring(firstOneIndex + 1));
						}
						return Long.parseLong(temp.toString(), 2);
					}
				})
				.toArray();
	}

	public long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				answer[i] = numbers[i] + 1;

			} else {
				StringBuilder temp = new StringBuilder();
				String binaryString = Long.toBinaryString(numbers[i]);
				if (!binaryString.contains("0")) {
					// 맨 앞을 10으로
					temp.append("10");

					// 나머지 자리수를 모두 1로
					temp.append(binaryString.substring(1).replace("0", "1"));

				} else {
					int lastIndex = binaryString.lastIndexOf("0");
					int firstOneIndex = binaryString.indexOf("1", lastIndex);
					// 마지막 0을 1로 수정
					temp.append(binaryString, 0, lastIndex).append("1");

					// 마지막 0 다음 1을 0으로 수정
					temp.append("0");

					// 그 다음 비트열
					temp.append(binaryString.substring(firstOneIndex + 1));
				}
				answer[i] = Long.parseLong(temp.toString(), 2);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		long[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		LongToBit longToBit = new LongToBit();
		long[] solution = longToBit.solution(numbers);
		System.out.println("solution = " + Arrays.toString(solution));

		long[] solution2 = longToBit.solutionStream(numbers);
		System.out.println("solution = " + Arrays.toString(solution2));
	}
}
