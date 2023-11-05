package progrmmers.level0;

/*
programmers
level: 0
title: 접두사인지 확인하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181906
*/
public class PrefixCheck {

	public int solution(String my_string, String is_prefix) {
		return my_string.startsWith(is_prefix) ? 1: 0;
	}

	public static void main(String[] args) {
		PrefixCheck solution = new PrefixCheck();

		String my_string = "banana";
		String is_prefix = "ban";
		int result = solution.solution(my_string, is_prefix);
		System.out.println("result = " + (result));
	}
}
