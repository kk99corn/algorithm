package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 문자 개수 세기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181902
*/
public class CountString {

	public int[] solution(String my_string) {
		int[] answer = new int[52];
		for (int i = 0; i <my_string.length(); i++) {
			int charIdx = my_string.charAt(i);
			if (charIdx >= 65 && charIdx <= 90) {
				answer[charIdx - 65] += 1;
			} else {
				answer[charIdx - 71] += 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		CountString solution = new CountString();
		String my_string = "Programmers";
		int[] solution1 = solution.solution(my_string);

		System.out.println("result = " + Arrays.toString(solution1));
	}
}
