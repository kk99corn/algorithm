package progrmmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 1
title: 둘만의 암호
도움말
url: https://school.programmers.co.kr/learn/courses/30/lessons/155652
*/
public class Password {

	public String solution(String s, String skip, int index) {
		String answer = "";
		List<Character> charList = new ArrayList<>();
		for (int i = 97; i <= 122; i++) {
			charList.add((char) i);
		}

		for (int i = 0; i < skip.length(); i++) {
			charList.remove((Character) skip.charAt(i));
		}

		for (int i = 0; i < s.length(); i++) {
			Character x = s.charAt(i);
			int xIndex = charList.indexOf(x) + index;
			while (xIndex >= charList.size()) {
				xIndex -= charList.size();
			}
			answer += charList.get(xIndex);
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		Password solution = new Password();
		String solution1 = solution.solution(s, skip, index);
		System.out.println("result = " + (solution1));
	}
}
