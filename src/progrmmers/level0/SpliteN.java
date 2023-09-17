package progrmmers.level0;

/*
programmers
level: 0
title: 문자열의 앞의 n글자
url: https://school.programmers.co.kr/learn/courses/30/lessons/181907
*/
public class SpliteN {

	public String solution(String my_string, int n) {
		return my_string.substring(0, n);
	}

	public static void main(String[] args) {
		SpliteN solution = new SpliteN();

		String my_string = "ProgrammerS123";
		int n = 11;
		String result = solution.solution(my_string, n);
		System.out.println("result = " + (result));
	}
}
