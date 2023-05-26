package progrmmers.level0;

/*
programmers
level: 0
title: 날짜 비교하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181838
*/
public class CompareDate {

	public int solution(int[] date1, int[] date2) {
		return (Integer.parseInt(date1[0] + "" + date1[1] + "" + date1[2]) < Integer.parseInt(date2[0] + "" + date2[1] + "" + date2[2])) ? 1 : 0;
	}

	public static void main(String[] args) {
		CompareDate solution = new CompareDate();

		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		int solution1 = solution.solution(date1, date2);
		System.out.println("result = " + (solution1));
	}
}
