package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 공백으로 구분하기 2
url: https://school.programmers.co.kr/learn/courses/30/lessons/181868
*/
public class SpaceSplit {

	public String[] solution(String my_string) {
		return my_string.trim().split("\\s+");
	}

	public static void main(String[] args) {
		SpaceSplit solution = new SpaceSplit();

		String my_string = " i    love  you";
		String[] result = solution.solution(my_string);
		System.out.println("result = " + Arrays.toString(result));
	}
}
