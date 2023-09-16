package progrmmers.level0;

/*
programmers
level: 0
title: 부분 문자열인지 확인하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181843
*/
public class ContainsString {

	public int solution(String my_string, String target) {
		return my_string.contains(target) ? 1 : 0;
	}

	public static void main(String[] args) {
		ContainsString solution = new ContainsString();

		String my_string = "banana";
		String target = "ana";
		int result = solution.solution(my_string, target);
		System.out.println("result = " + (result));
	}
}
