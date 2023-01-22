package progrmmers.level0;

/*
programmers
level: 0
title: 나이 출력
url: https://school.programmers.co.kr/learn/courses/30/lessons/120820
*/
public class PrintAge {

	public int solution(int age) {
		return 2023 - age;
	}

	public static void main(String[] args) {
		int age = 23;
		PrintAge solution = new PrintAge();
		int solution1 = solution.solution(age);
		System.out.println("result = " + (solution1));
	}
}
