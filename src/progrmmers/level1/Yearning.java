package progrmmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
programmers
level: 1
title: 추억 점수
url: https://programmers.co.kr/learn/courses/30/lessons/176963
*/
public class Yearning {

	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> yearningMap = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			yearningMap.put(name[i], yearning[i]);
		}

		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				answer[i] += yearningMap.getOrDefault(photo[i][j], 0);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		Yearning arrayDivide = new Yearning();
		int[] solution = arrayDivide.solution(name, yearning, photo);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
