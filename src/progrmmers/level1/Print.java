package progrmmers.level1;

import java.util.Arrays;

/*
programmers
level: 1
title: 덧칠하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/161989
*/
public class Print {

	public int solutionStream(int n, int m, int[] section) {
		int[] p = {section[0] + m - 1};
		return (int) Arrays.stream(section)
				.skip(1)
				.filter(s -> {
					boolean isGreater = s > p[0];
					if (isGreater) {
						p[0] = s + m - 1;
					}
					return isGreater;
				})
				.count() + 1;
	}

	public int solution(int n, int m, int[] section) {
		int answer = 1;
		int p = section[0] + m - 1;
		for (int s : section) {
			if (s > p) {
				p = s + m - 1;
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};

		Print solution = new Print();
		int solution1 = solution.solution(n, m, section);
		System.out.println("result = " + (solution1));

		int solution2 = solution.solutionStream(n, m, section);
		System.out.println("result = " + (solution2));
	}
}
