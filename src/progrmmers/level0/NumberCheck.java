package progrmmers.level0;

/*
programmers
level: 0
title: 정수 부분
url: https://school.programmers.co.kr/learn/courses/30/lessons/181850
*/
public class NumberCheck {

	public int solution(double flo) {
		return (int) flo;
	}

	public static void main(String[] args) {
		double flo = 69.32;
		NumberCheck solution = new NumberCheck();
		int solution1 = solution.solution(flo);
		System.out.println("result = " + (solution1));
	}
}
