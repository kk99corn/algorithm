package progrmmers.level1;

import java.util.Arrays;

/*
programmers
level: 1
title: 옹알이 (2)

url: https://programmers.co.kr/learn/courses/30/lessons/147355
*/
public class Babbling {

	public int solution_stream(String[] babbling) {
		return (int) Arrays.stream(babbling)
				.filter(s -> !(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")))
				.map(s -> s.replaceAll("aya|ye|woo|ma", ""))
				.filter(s -> s.length() == 0)
				.count();
	}

	public int solution(String[] babbling) {
		int answer = 0;

		for (String s : babbling) {
			if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
				continue;
			}

			s = s.replace("aya", " ");
			s = s.replace("ye", " ");
			s = s.replace("woo", " ");
			s = s.replace("ma", " ");
			s = s.replace(" ", "");

			if (s.length() == 0) answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

		Babbling solution1 = new Babbling();
		int solution = solution1.solution_stream(babbling);
		System.out.println("solution = " + solution);
	}
}
