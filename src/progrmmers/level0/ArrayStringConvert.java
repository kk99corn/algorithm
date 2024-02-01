package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열에서 문자열 대소문자 변환하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181875
*/
public class ArrayStringConvert {

	public String[] solution(String[] strArr) {
		String[] answer = new String[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			answer[i] = (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
		}
		return answer;
	}

	public static void main(String[] args) {
		ArrayStringConvert solution = new ArrayStringConvert();

		String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
		String[] result = solution.solution(strArr);
		System.out.println("result = " + Arrays.toString(result));
	}
}
