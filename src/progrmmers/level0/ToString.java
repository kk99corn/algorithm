package progrmmers.level0;

/*
programmers
level: 0
title: 문자열로 변환
url: https://school.programmers.co.kr/learn/courses/30/lessons/181845
*/
public class ToString {

	public String solution(int n) {
		return "" + n;
	}

	public static void main(String[] args) {
		ToString solution = new ToString();

		int n = 10;
		String result = solution.solution(n);
		System.out.println("result = " + (result));
	}
}
