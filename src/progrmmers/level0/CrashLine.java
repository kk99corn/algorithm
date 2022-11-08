package progrmmers.level0;

/*
programmers
level: 0
title: 겹치는 선분의 길이
url: https://school.programmers.co.kr/learn/courses/30/lessons/120876
*/
public class CrashLine {

	public int solution(int[][] lines) {
		int answer = 0;
		int[] checked = new int[201];   // -100 ~ 100

		for (int[] line : lines) {
			int start = line[0] + 100;
			int end = line[1] + 100;

			for (int i = start + 1; i <= end; i++) {
				switch (checked[i]) {
					case 0:
						checked[i] = 1;
						break;
					case 1:
						checked[i] = 2;
						answer++;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
		CrashLine solution = new CrashLine();
		int result = solution.solution(lines);
		System.out.println("result = " + result);
	}
}
