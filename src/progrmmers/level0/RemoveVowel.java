package progrmmers.level0;

/*
programmers
level: 0
title: 모음 제거
url: https://school.programmers.co.kr/learn/courses/30/lessons/120849
*/
public class RemoveVowel {

	public String solution(String my_string) {
		return my_string.replaceAll("[aeiou]", "");
	}

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		RemoveVowel solution = new RemoveVowel();
		String solution1 = solution.solution(my_string);
		System.out.println("result = " + (solution1));
	}
}
