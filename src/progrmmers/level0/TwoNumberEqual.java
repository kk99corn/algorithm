package progrmmers.level0;

/*
programmers
level: 0
title: 숫자 비교하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120807
*/
public class TwoNumberEqual {

	public int solution(int num1, int num2) {
		return (num1 == num2) ? 1 : -1;
	}

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 16;
		TwoNumberEqual solution = new TwoNumberEqual();
		int solution1 = solution.solution(n1, n2);
		System.out.println("result = " + solution1);
	}
}
