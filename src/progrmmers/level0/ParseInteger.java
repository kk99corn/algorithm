package progrmmers.level0;

/*
programmers
level: 0
title: 문자열을 정수로 변환하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181848
*/
public class ParseInteger {

	public int solution(String n_str) {
		return Integer.parseInt(n_str);
	}

	public static void main(String[] args) {
		ParseInteger solution = new ParseInteger();

		String n_str = "10";
		int result = solution.solution(n_str);
		System.out.println("result = " + (result));
	}
}
