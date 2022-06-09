package level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 숫자 블록
url: https://programmers.co.kr/learn/courses/30/lessons/12923
*/
public class NumberBlock {
	public int[] solution(long begin, long end) {
		int ibegin = Long.valueOf(begin).intValue();
		int iend = Long.valueOf(end).intValue();
		int[] answer = new int[Long.valueOf(end - begin + 1).intValue()];

		for (int i = ibegin; i <= iend; i++) {
			if (i == 1) {
				answer[i - ibegin] = 0;
				continue;
			}

			boolean isOk = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0 && (i / j) <= 10000000) {
					answer[i - ibegin] = i / j;
					isOk = true;
					break;
				}
			}
			if (!isOk) answer[i - ibegin] = 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		NumberBlock numberBlock = new NumberBlock();
		int[] solution = numberBlock.solution(1, 10);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
