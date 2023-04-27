package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 정수를 나선형으로 배치하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181832
*/
public class SpiralNumber {

	public int[][] solution(int n) {
		int[][] answer = new int[n][n];

		char action = 'l';
		int x = 1;
		int a = 0;
		int b = 0;
		do {
			switch (action) {
				case 'l':
					if (b == n || answer[a][b] != 0) {
						action = 'd';
						a++;
						b--;
						x--;
					} else {
						answer[a][b] = x;
						b++;
					}
					break;
				case 'r':
					if (b == -1 || answer[a][b] != 0) {
						action = 'u';
						a--;
						b++;
						x--;

					} else {
						answer[a][b] = x;
						b--;
					}
					break;
				case 'u':
					if (a == -1 || answer[a][b] != 0) {
						action = 'l';
						a++;
						b++;
						x--;
					} else {
						answer[a][b] = x;
						a--;
					}
					break;
				case 'd':
					if (a == n || answer[a][b] != 0) {
						action = 'r';
						a--;
						b--;
						x--;
					} else {
						answer[a][b] = x;
						a++;
					}
					break;
			}
			x++;
		} while (x <= n * n);
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		SpiralNumber solution = new SpiralNumber();
		int[][] solution1 = solution.solution(n);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
