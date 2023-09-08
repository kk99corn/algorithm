package progrmmers.level0;

/*
programmers
level: 0
title: 문자열 곱하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181940
*/
public class MultipleString {

	public String solution(String my_string, int k) {
		String answer = "";
		for (int i = 0; i < k; i++) {
			answer += my_string;
		}
		return answer;
	}

	public static void main(String[] args) {
		MultipleString solution = new MultipleString();

		String my_string = "string";
		int k = 3;
		String result = solution.solution(my_string, k);
		System.out.println("result = " + (result));
	}
}
