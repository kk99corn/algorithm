package progrmmers.level0;

import java.util.Map;
import java.util.TreeMap;

/*
programmers
level: 0
title: 한 번만 등장한 문자
url: https://school.programmers.co.kr/learn/courses/30/lessons/120896
*/
public class WholeWord {

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();

		Map<Character, Integer> map = new TreeMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Character c : map.keySet()) {
			answer.append((map.get(c) == 1) ? c : "");
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		String s = "adasdasdasidoqwnuieqwbeihasdnasdnajkdandjasdnasjk";
		WholeWord solution = new WholeWord();
		String solution1 = solution.solution(s);
		System.out.println("result = " + solution1);
	}
}
