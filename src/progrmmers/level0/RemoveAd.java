package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: ad 제거하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181870
*/
public class RemoveAd {

	public String[] solution(String[] strArr) {
		List<String> list = new ArrayList<>();
		for (String s : strArr) {
			if (!s.contains("ad")) list.add(s);
		}
		return list.toArray(new String[0]);
	}

	public static void main(String[] args) {
		RemoveAd solution = new RemoveAd();

		String[] strArr = {"and", "notad", "abcd"};
		String[] solution1 = solution.solution(strArr);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
