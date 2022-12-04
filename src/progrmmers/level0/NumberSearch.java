package progrmmers.level0;

/*
programmers
level: 0
title: 숫자 찾기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120904
*/
public class NumberSearch {

	public int solution(int num, int k) {
		return (Integer.toString(num).contains(Integer.toString(k))) ? Integer.toString(num).indexOf(Integer.toString(k)) + 1 : -1;
	}

	public static void main(String[] args) {
		int n = 29183;
		int k = 1;
		NumberSearch solution = new NumberSearch();
		int solution1 = solution.solution(n, k);
		System.out.println("result = " + (solution1));
	}
}
