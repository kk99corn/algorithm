package progrmmers.level0;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 외계행성의 나이
url: https://school.programmers.co.kr/learn/courses/30/lessons/120834
*/
public class ExoplanetsAge {

	public String solution(int age) {
		Map<Character, String> ageMap = new HashMap<>();
		ageMap.put('0', "a");
		ageMap.put('1', "b");
		ageMap.put('2', "c");
		ageMap.put('3', "d");
		ageMap.put('4', "e");
		ageMap.put('5', "f");
		ageMap.put('6', "g");
		ageMap.put('7', "h");
		ageMap.put('8', "i");
		ageMap.put('9', "j");

		return String.valueOf(age).chars()
				.mapToObj(c -> ageMap.get((char) c))
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		int age = 100;
		ExoplanetsAge solution = new ExoplanetsAge();
		String solution1 = solution.solution(age);
		System.out.println("result = " + (solution1));
	}
}
