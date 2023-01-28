package progrmmers.level0;

/*
programmers
level: 0
title: 점의 위치 구하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120841
*/
public class SearchDot {

	public int solution(int[] dot) {
		if (dot[0] > 0 && dot[1] > 0) {
			return 1;
		} else if(dot[0] < 0 && dot[1] > 0) {
			return 2;
		} else if(dot[0] < 0 && dot[1] < 0) {
			return 3;
		} else {
			return 4;
		}
	}

	public static void main(String[] args) {
		int[] dot = {-7, 9};
		SearchDot solution = new SearchDot();
		int solution1 = solution.solution(dot);
		System.out.println("result = " + (solution1));
	}
}
