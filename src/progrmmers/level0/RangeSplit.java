package progrmmers.level0;

/*
programmers
level: 0
title: 문자열의 뒤의 n글자
url: https://school.programmers.co.kr/learn/courses/30/lessons/181910
*/
public class RangeSplit {

	public String solution(String my_string, int n) {
		return my_string.substring(my_string.length() - n);
	}

	public static void main(String[] args) {
		RangeSplit solution = new RangeSplit();

		String my_string = "ProgrammerS123";
		int n = 11;
		String result = solution.solution(my_string, n);
		System.out.println("result = " + (result));
	}
}
