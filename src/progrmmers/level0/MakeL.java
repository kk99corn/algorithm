package progrmmers.level0;

import java.util.stream.Collectors;

/*
programmers
level: 0
title: l로 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181834
*/
public class MakeL {

	public String solutionStream(String myString) {
		return myString.chars()
				.mapToObj(ch -> ch <= 'l' ? "l" : String.valueOf((char) ch))
				.collect(Collectors.joining());
	}

	public String solution(String myString) {
		String answer = "";
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) <= 'l') {
				answer += "l";
			} else {
				answer += myString.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		MakeL solution = new MakeL();

		String myString = "abcdevwxyz";
		String solution1 = solution.solution(myString);
		System.out.println("result = " + (solution1));

		String solution2 = solution.solutionStream(myString);
		System.out.println("result = " + (solution2));
	}
}
