package progrmmers.level2;

/*
programmers
level: 2
title: 숫자의 표현
url: https://programmers.co.kr/learn/courses/30/lessons/12924
*/
public class NumberExpress {
	public int solution(int n) {
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			int number = i;
			for (int j = i + 1; j <= n; j++) {
				if (number == n) {
					answer++;
				}
				number += j;
				if (number > n) {
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		NumberExpress numberExpress = new NumberExpress();
		int solution = numberExpress.solution(15);
		System.out.println("solution = " + solution);
	}
}
