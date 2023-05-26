package progrmmers.level0;

/*
programmers
level: 0
title: 문자열이 몇 번 등장하는지 세기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181871
*/
public class StringCounting {

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
	}
}
