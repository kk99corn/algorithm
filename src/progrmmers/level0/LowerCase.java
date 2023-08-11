package progrmmers.level0;

/*
programmers
level: 0
title: 소문자로 바꾸기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181876
*/
public class LowerCase {

	public String solution(String myString) {
		return myString.toLowerCase();
	}

	public static void main(String[] args) {
		LowerCase solution = new LowerCase();

		String myString = "aBcDeFg";
		String result = solution.solution(myString);
		System.out.println("result = " + (result));
	}
}
