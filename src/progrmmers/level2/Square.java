package progrmmers.level2;

/*
programmers
level: 2
title: 멀쩡한 사각형
url: https://programmers.co.kr/learn/courses/30/lessons/62048
*/
public class Square {
	public long solution(int w, int h) {
		long answer = 0;

		for (int i = 1; i < w; i++) {
			long n = (long)((double)h * i / w);
			answer += n;
		}

		return answer * 2;
	}

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		Square square = new Square();
		long solution = square.solution(w, h);
		System.out.println(solution);
	}
}
