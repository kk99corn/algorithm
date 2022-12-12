package progrmmers.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
programmers
level: 0
title: 암호 해독
url: https://school.programmers.co.kr/learn/courses/30/lessons/120892
*/
public class DecryptPassword {

	public String solution(String cipher, int code) {
		String[] words = cipher.split("");
		return IntStream.range(0, words.length)
				.filter(i -> ((i + 1) % code) == 0)
				.mapToObj(i -> words[i])
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		DecryptPassword solution = new DecryptPassword();
		String solution1 = solution.solution(cipher, code);
		System.out.println("result = " + (solution1));
	}
}
