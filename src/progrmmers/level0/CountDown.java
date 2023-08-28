package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 카운트 다운
url: https://school.programmers.co.kr/learn/courses/30/lessons/181899
*/
public class CountDown {

	public int[] solution(int start, int end_num) {
		int[] answer = new int[start - end_num + 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = start - i;
		}
		return answer;
	}

	public static void main(String[] args) {
		CountDown solution = new CountDown();

		int start_num = 10;
		int end_num = 3;
		int[] result = solution.solution(start_num, end_num);
		System.out.println("result = " + Arrays.toString(result));
	}
}
