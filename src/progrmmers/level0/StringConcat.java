package progrmmers.level0;

/*
programmers
level: 0
title: 문자 리스트를 문자열로 변환하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181941
*/
public class StringConcat {

	public String solution(String[] arr) {
		return String.join("", arr);
	}

	public static void main(String[] args) {
		StringConcat solution = new StringConcat();


		String[] arr = {"a", "b", "c"};
		String  result = solution.solution(arr);
		System.out.println("result = " + (result));
	}
}
