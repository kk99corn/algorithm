package progrmmers.level2;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
programmers
level: 2
title: JadenCase 문자열 만들기
url: https://programmers.co.kr/learn/courses/30/lessons/12951
*/
public class JadenCase {

	public String solutionStream(String s) {
		return Arrays.stream(s.split(" "))
				.filter(word -> !word.isEmpty())
				.map(word -> {
					StringBuilder sb = new StringBuilder(word.toLowerCase());
					if (sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') {
						sb.replace(0, 1, String.valueOf(Character.toUpperCase(sb.charAt(0))));
					}
					return sb.toString();
				})
				.collect(Collectors.joining(" ")) + (s.charAt(s.length() - 1) == ' ' ? " " : "");
	}

	public String solution(String s) {
		String[] words = s.split(" ");
		StringBuilder answer = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				StringBuilder sb = new StringBuilder(word.toLowerCase());
				if (sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') {
					sb.replace(0, 1, String.valueOf(Character.toUpperCase(sb.charAt(0))));
				}
				answer.append(sb);
			}
			answer.append(" ");
		}
		String result = answer.toString().trim();
		if (s.charAt(s.length() - 1) == ' ') {
			result += " ";
		}
		return result;
	}

	public static void main(String[] args) {
		JadenCase jadenCase = new JadenCase();
		String s = "3people unFollowed me";
		String solution = jadenCase.solution(s);
		System.out.println("solution = " + solution);

		String solution2 = jadenCase.solution(s);
		System.out.println("solution = " + solution2);
	}
}
