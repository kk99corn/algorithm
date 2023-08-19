package progrmmers.level0;

/*
programmers
level: 0
title: 문자열 정수의 합
url: https://school.programmers.co.kr/learn/courses/30/lessons/181849
*/
public class StringNumberSum {

	public int solution(String num_str) {
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += Character.getNumericValue(num_str.charAt(i));
		}

		return answer;
	}

	public static void main(String[] args) {
		StringNumberSum solution = new StringNumberSum();

		String myString = "123456789";
		int result = solution.solution(myString);
		System.out.println("result = " + (result));
	}
}
