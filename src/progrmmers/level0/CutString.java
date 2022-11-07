package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 잘라서 배열로 저장하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120913
*/
public class CutString {
	public String[] solution(String my_str, int n) {
		String[] answer = new String[(my_str.length() - 1) / n + 1];

		int answerIdx = 0;
		for (int i = 0; i < my_str.length(); i += n) {
			answer[answerIdx++] = my_str.substring(i, Math.min(i + n, my_str.length()));
		}

		return answer;
	}

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		CutString cutString = new CutString();
		String[] solution = cutString.solution(my_str, n);
		System.out.println(Arrays.toString(solution));
	}
}
