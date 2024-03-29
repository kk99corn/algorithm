package progrmmers.level1;

import java.util.stream.IntStream;

/*
programmers
level: 1
title: 나머지가 1이 되는 수 찾기
url: https://programmers.co.kr/learn/courses/30/lessons/87389
*/
public class FindRemainderOne {

	public int solution_stream(int n) {
		return IntStream.range(2, n)
				.filter(i -> n % i == 1)
				.findFirst()
				.orElse(0);
	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		FindRemainderOne findRemainderOne = new FindRemainderOne();
		System.out.println(findRemainderOne.solution_stream(10));
	}
}
