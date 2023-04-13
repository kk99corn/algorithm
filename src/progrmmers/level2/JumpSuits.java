package progrmmers.level2;

import java.util.stream.IntStream;

/*
programmers
level: 2
title: 점프와 순간 이동
url: https://programmers.co.kr/learn/courses/30/lessons/12980
*/
public class JumpSuits {

	public int solutionStream(int n) {
		return IntStream.iterate(n, i -> i != 0, i -> i % 2 == 0 ? i / 2 : i - 1)
				.map(i -> i % 2)
				.sum();
	}

	public int solution(int n) {
		int ans = 0;
		while (n != 0) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n -= 1;
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		JumpSuits jumpSuits = new JumpSuits();
		int solution = jumpSuits.solution(5000);
		System.out.println(solution);

		int solution2 = jumpSuits.solutionStream(5000);
		System.out.println(solution2);
	}
}
