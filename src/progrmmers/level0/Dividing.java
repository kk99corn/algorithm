package progrmmers.level0;


/*
programmers
level: 0
title: 두 수의 차
url: https://school.programmers.co.kr/learn/courses/30/lessons/120803
*/
public class Dividing {

	public int solution(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {
		int num1, num2;
		num1 = 2;
		num2 = 2;
		Dividing solution = new Dividing();
		int result = solution.solution(num1, num2);
		System.out.println("result = " + result);
	}
}
