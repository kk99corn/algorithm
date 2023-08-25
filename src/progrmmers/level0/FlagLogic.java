package progrmmers.level0;

/*
programmers
level: 0
title: flag에 따라 다른 값 반환하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181933
*/
public class FlagLogic {

	public int solution(int a, int b, boolean flag) {
		return flag ? a + b : a - b;
	}

	public static void main(String[] args) {
		FlagLogic solution = new FlagLogic();

		int a = -4;
		int b = 7;
		boolean flag = true;
		int result = solution.solution(a, b, flag);
		System.out.println("result = " + (result));
	}
}
