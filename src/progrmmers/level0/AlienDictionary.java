package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 외계어 사전
url: https://school.programmers.co.kr/learn/courses/30/lessons/120869
*/
public class AlienDictionary {

	public int solution(String[] spell, String[] dic) {
		int answer = 2;
		for (String s : dic) {
			if (s.length() == spell.length) {
				String temp = s;
				for (String value : spell) {
					temp = temp.replaceFirst(value, "");
				}
				if (temp.length() == 0) {
					answer = 1;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};

		AlienDictionary solution = new AlienDictionary();
		int solution1 = solution.solution(spell, dic);

		System.out.println("result = " + solution1);
	}
}
