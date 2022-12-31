package progrmmers.level0;

/*
programmers
level: 0
title: 특정 문자 제거하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120826
*/
public class RemoveWord {

	public String solution(String my_string, String letter) {
		return my_string.replaceAll(letter, "");
	}

	public static void main(String[] args) {
		String my_string = "abcdef";
		String letter = "f";
		RemoveWord solution = new RemoveWord();
		String solution1 = solution.solution(my_string, letter);
		System.out.println("result = " + (solution1));
	}
}
