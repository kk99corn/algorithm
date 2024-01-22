package progrmmers.level0;

/*
programmers
level: 0
title: 접미사인지 확인하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181908
*/
public class SuffixCheck {

	public int solution(String my_string, String is_suffix) {
		return my_string.endsWith(is_suffix) ? 1 : 0;
	}

	public static void main(String[] args) {
		SuffixCheck solution = new SuffixCheck();

		String my_string = "banana";
		String is_suffix = "ana";
		int result = solution.solution(my_string, is_suffix);
		System.out.println("result = " + (result));
	}
}
