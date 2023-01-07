package progrmmers.level0;

/*
programmers
level: 0
title: 문자열 뒤집기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120822
*/
public class ReverseString {

	public String solution(String my_string) {
		return new StringBuilder(my_string).reverse().toString();
	}

	public static void main(String[] args) {
		String my_string = "jaron";
		ReverseString solution = new ReverseString();
		String solution1 = solution.solution(my_string);
		System.out.println("result = " + (solution1));
	}
}
