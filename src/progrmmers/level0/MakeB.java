package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: A로 B 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120886
*/
public class MakeB {

	public int solution(String before, String after) {
		char[] beforeChars = before.toCharArray();
		char[] afterChars = after.toCharArray();

		Arrays.sort(beforeChars);
		Arrays.sort(afterChars);

		for (int i = 0; i < beforeChars.length; i++) {
			if (beforeChars[i] != afterChars[i]) {
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		MakeB solution = new MakeB();
		int solution1 = solution.solution(before, after);
		System.out.println("result = " + solution1);
	}
}
