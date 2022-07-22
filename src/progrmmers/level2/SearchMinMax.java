package progrmmers.level2;

/*
programmers
level: 2
title: 최댓값과 최솟값
url: https://programmers.co.kr/learn/courses/30/lessons/12939
*/
public class SearchMinMax {
	public String solution(String s) {
		String[] sArr = s.split(" ");
		int min = Integer.parseInt(sArr[0]);
		int max = Integer.parseInt(sArr[0]);

		for (String num : sArr) {
			int n = Integer.parseInt(num);
			if (min > n) min = n;
			if (max < n) max = n;
		}

		return min + " " + max;
	}

	public static void main(String[] args) {
		SearchMinMax searchMinMax = new SearchMinMax();
		String solution = searchMinMax.solution("1 2 3 4");
		System.out.println("solution = " + solution);
	}
}
