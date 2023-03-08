package progrmmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
programmers
level: 1
title: 가장 가까운 같은 글자
url: https://school.programmers.co.kr/learn/courses/30/lessons/142086
*/
public class NearWord {

	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			answer[i] = (map.get(s.charAt(i)) != null) ? i - map.get(s.charAt(i)) : -1;
			map.put(s.charAt(i), i);
		}
		return answer;
	}

		public static void main(String[] args) {
		String s = "banana";
		NearWord solution = new NearWord();
		int[] solution1 = solution.solution(s);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
