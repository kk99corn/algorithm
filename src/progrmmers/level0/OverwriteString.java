package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 문자열 겹쳐쓰기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181943
*/
public class OverwriteString {

	public String solution(String my_string, String overwrite_string, int s) {
		return my_string.substring(0, s)
				+ overwrite_string
				+ my_string.substring(s + overwrite_string.length());
	}

	public static void main(String[] args) {
		OverwriteString solution = new OverwriteString();
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;
		String solution1 = solution.solution(my_string, overwrite_string, s);

		System.out.println("result = " + (solution1));
	}
}
