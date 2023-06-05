package progrmmers.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
programmers
level: 0
title: 문자열이 몇 번 등장하는지 세기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181871
*/
public class StringCounting {

	public int solutionStream(String myString, String pat) {
		int answer = 0;
		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			String temp = IntStream.range(i, i + pat.length())
					.mapToObj(j -> String.valueOf(myString.charAt(j)))
					.collect(Collectors.joining());

			if (pat.equals(temp)) {
				answer++;
			}
		}
		return answer;
	}

	public int solution(String myString, String pat) {
		int answer = 0;
		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			String temp = String.valueOf(myString.charAt(i));
			for (int j = 1; j < pat.length(); j++) {
				temp += String.valueOf(myString.charAt(i + j));
			}

			if (pat.equals(temp)) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		StringCounting solution = new StringCounting();

		String my_string = "banana";
		String pat = "ana";
		int solution1 = solution.solution(my_string, pat);
		System.out.println("result = " + (solution1));

		int solution2 = solution.solutionStream(my_string, pat);
		System.out.println("result = " + (solution2));
	}
}
