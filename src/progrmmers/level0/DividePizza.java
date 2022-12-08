package progrmmers.level0;

/*
programmers
level: 0
title: 피자 나눠 먹기 (2)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120815
*/
public class DividePizza {

	public int solution(int n) {
		return n / getGCD(n, 6);
	}

	// 최대공약수
	public int getGCD(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		int n = 10;
		DividePizza solution = new DividePizza();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
