package level1;

/*
programmers
level: 1
title: 약수의 개수와 덧셈
url: https://programmers.co.kr/learn/courses/30/lessons/77884
*/
public class DivisorCalc {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int d = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					d++;
				}
			}
			answer = d%2 == 0 ? answer + i : answer - i;
		}

		return answer;
	}

	public static void main(String[] args) {
		DivisorCalc divisorCalc = new DivisorCalc();
		int solution = divisorCalc.solution(13, 17);
		System.out.println("solution = " + solution);
	}
}
