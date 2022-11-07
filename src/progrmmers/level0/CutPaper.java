package progrmmers.level0;

/*
programmers
level: 0
title: 종이 자르기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120922
*/
public class CutPaper {
	public int solution(int M, int N) {
		int answer = 0;
		if (M * N != 1) {
			answer = M * N - 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		int M = 2;
		int N = 2;
		CutPaper cutPaper = new CutPaper();
		int result = cutPaper.solution(M, N);
		System.out.println("result = " + result);
	}
}
