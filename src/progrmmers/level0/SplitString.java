package progrmmers.level0;

/*
programmers
level: 0
title: 부분 문자열
url: https://school.programmers.co.kr/learn/courses/30/lessons/181842
*/
public class SplitString {

	public int solution(String str1, String str2) {
		return str2.contains(str1) ? 1 : 0;
	}

	public static void main(String[] args) {
		SplitString solution = new SplitString();

		String str1 = "abc";
		String str2 = "aabcc";
		int result = solution.solution(str1, str2);
		System.out.println("result = " + (result));
	}
}
