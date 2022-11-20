package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 영어가 싫어요
url: https://school.programmers.co.kr/learn/courses/30/lessons/120894
*/
public class HateEnglish {

	public long solution(String numbers) {
		String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for (int i = 0; i < numStr.length; i++) {
			numbers = numbers.replaceAll(numStr[i], Integer.toString(i));
		}
		return Long.parseLong(numbers);
	}

	public static void main(String[] args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		HateEnglish solution = new HateEnglish();
		long solution1 = solution.solution(numbers);

		System.out.println("result = " + solution1);
	}
}
