package progrmmers.level0;

/*
programmers
level: 0
title: 문자열안에 문자열
url: https://school.programmers.co.kr/learn/courses/30/lessons/120908
*/
public class StringInString {
	public int solution(String str1, String str2) {
		return (str1.contains(str2)) ? 1 : 2;
	}

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		StringInString stringInString = new StringInString();
		int result = stringInString.solution(str1, str2);
		System.out.println("result = " + result);
	}
}
