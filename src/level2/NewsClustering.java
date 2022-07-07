package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
programmers
level: 2
title: [1차] 뉴스 클러스터링
url: https://programmers.co.kr/learn/courses/30/lessons/17677
*/
public class NewsClustering {
	public int solution(String str1, String str2) {
		// 소문자로 변환
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		// str1 -> list1
		for (int i = 0; i < str1.length() - 1; i++) {
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'
					&& str1.charAt(i + 1) >= 'A' && str1.charAt(i + 1) <= 'Z') {
				list1.add(str1.charAt(i) + "" + str1.charAt(i + 1));
			}
		}

		// str2 -> list2
		for (int i = 0; i < str2.length() - 1; i++) {
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'
					&& str2.charAt(i + 1) >= 'A' && str2.charAt(i + 1) <= 'Z') {
				list2.add(str2.charAt(i) + "" + str2.charAt(i + 1));
			}
		}

		// 중복 원소 처리위해 정렬
		Collections.sort(list1);
		Collections.sort(list2);

		List<String> tempList1 = new ArrayList<>();    // 교집합 리스트
		List<String> tempList2 = new ArrayList<>();    // 합집합 리스트

		// 교집합 세팅
		for (String s : list1) {
			if (list2.remove(s)) {
				tempList1.add(s);
			}
			tempList2.add(s);
		}

		// 합집합 세팅
		tempList2.addAll(list2);

		float answer = 1;
		if (tempList2.size() != 0) {
			answer = (float) tempList1.size() / tempList2.size();
		}

		return (int) (answer * 65536);
	}

	public static void main(String[] args) {
		String str1 = "aa1+aa2";
		String str2 = "AAAA12";
		NewsClustering newsClustering = new NewsClustering();
		int solution = newsClustering.solution(str1, str2);
		System.out.println("solution = " + solution);
	}
}
