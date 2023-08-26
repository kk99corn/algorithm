package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 카운트 업
url: https://school.programmers.co.kr/learn/courses/30/lessons/181920
*/
public class CountUp {

	public int[] solution(int start_num, int end_num) {
		int[] answer = new int [end_num - start_num + 1];
		for (int i = 0; i <= end_num - start_num; i++) {
			answer[i] = i + start_num;
		}
		return answer;
	}

	public static void main(String[] args) {
		CountUp solution = new CountUp();

		int start_num = 3;
		int end_num = 10;
		int[] result = solution.solution(start_num, end_num);
		System.out.println("result = " + Arrays.toString(result));
	}
}
