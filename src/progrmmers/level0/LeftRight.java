package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 왼쪽 오른쪽
url: https://school.programmers.co.kr/learn/courses/30/lessons/181890
*/
public class LeftRight {

	public String[] solution(String[] str_list) {
		String[] answer = {};
		int start = 0;
		int end;

		int l = Arrays.asList(str_list).indexOf("l");
		int r = Arrays.asList(str_list).indexOf("r");

		if (l == -1 && r >= 0 && r < str_list.length - 1) {
			start = r + 1;
			answer = new String[str_list.length - start];
		} else if (r == -1 && l > 0) {
			end = l;
			answer = new String[end];
		} else if (l >= 0 && r >= 0) {
			if (l < r) {
				end = l;
				answer = new String[end];
			} else {
				start = r + 1;
				answer = new String[str_list.length - start];
			}
		} else {
			return answer;
		}

		System.arraycopy(str_list, start, answer, 0, answer.length);
		return answer;
	}

	public static void main(String[] args) {
		LeftRight solution = new LeftRight();

		String[] str_list = {"u", "u", "l", "r"};
		String[] solution1 = solution.solution(str_list);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
