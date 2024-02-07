package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 공백으로 구분하기 1
url: https://school.programmers.co.kr/learn/courses/30/lessons/181869
*/
public class SpaceSplit2 {

	public String[] solution(String my_string) {
		return my_string.split(" ");
	}

	public static void main(String[] args) {
		SpaceSplit2 solution = new SpaceSplit2();

		String my_string = "i love you";
		String[] result = solution.solution(my_string);
		System.out.println("result = " + Arrays.toString(result));
	}
}
