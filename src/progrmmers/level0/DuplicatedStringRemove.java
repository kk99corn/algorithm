package progrmmers.level0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
programmers
level: 0
title: 중복된 문자 제거
url: https://school.programmers.co.kr/learn/courses/30/lessons/120888
*/
public class DuplicatedStringRemove {

	public String solution(String my_string) {
		String[] wordArr = my_string.split("");
		Set<String> wordSet = new LinkedHashSet<>(Arrays.asList(wordArr));

		String answer = "";
		for (String s : wordSet) answer += s;
		return answer;
	}

	public static void main(String[] args) {
		String my_string = "people";
		DuplicatedStringRemove solution = new DuplicatedStringRemove();
		String solution1 = solution.solution(my_string);
		System.out.println("result = " + solution1);
	}
}
