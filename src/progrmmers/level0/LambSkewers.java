package progrmmers.level0;

/*
programmers
level: 0
title: 양꼬치
url: https://school.programmers.co.kr/learn/courses/30/lessons/120830
*/
public class LambSkewers {

	public int solution(int n, int k) {
		int i = n / 10;
		if (k > 0) {
			k -= i;
		}
		return n * 12000 + k * 2000;
	}

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		LambSkewers solution = new LambSkewers();
		int solution1 = solution.solution(n, k);
		System.out.println("result = " + (solution1));
	}
}
