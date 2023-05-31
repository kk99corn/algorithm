package progrmmers.level0;

/*
programmers
level: 0
title: 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

url: https://school.programmers.co.kr/learn/courses/30/lessons/181872
*/
public class LongString {

	public String solution(String myString, String pat) {
		return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
	}

	public static void main(String[] args) {
		LongString solution = new LongString();
		String myString = "AbCdEFG";
		String pat = "dE";
		String solution1 = solution.solution(myString, pat);
		System.out.println("result = " + (solution1));
	}
}
