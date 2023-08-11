package progrmmers.level0;

/*
programmers
level: 0
title: 대문자로 바꾸기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181877
*/
public class UpperCase {

	public String solution(String myString) {
		return myString.toUpperCase();
	}

	public static void main(String[] args) {
		UpperCase solution = new UpperCase();

		String myString = "aBcDeFg";
		String result = solution.solution(myString);
		System.out.println("result = " + (result));
	}
}
