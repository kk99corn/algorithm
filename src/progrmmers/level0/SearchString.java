package progrmmers.level0;

/*
programmers
level: 0
title: 원하는 문자열 찾기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181878
*/
public class SearchString {

	public int solution(String myString, String pat) {
		return (myString.toUpperCase().contains(pat.toUpperCase())) ? 1 : 0;
	}

	public static void main(String[] args) {
		SearchString solution = new SearchString();

		String myString = "AbCdEfG";
		String pat = "aBc";
		int result = solution.solution(myString, pat);
		System.out.println("result = " + (result));
	}
}
