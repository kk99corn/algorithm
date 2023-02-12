package progrmmers.level1;

import java.util.stream.IntStream;

/*
programmers
level: 1
title: 크기가 작은 부분 문자열
url: https://programmers.co.kr/learn/courses/30/lessons/147355
*/
public class SmallString {

	public int solutionStream(String t, String p) {
		int pLength = p.length();
		return (int) IntStream.range(0, t.length() - pLength + 1)
				.filter(i -> Integer.parseInt(t.charAt(i) + "") <= Integer.parseInt(p.charAt(0) + ""))
				.filter(i -> t.substring(i, i + (pLength)).compareTo(p) <=  0)
				.count();
	}

	public int solution(String t, String p) {
		int answer = 0;
		int pLength = p.length();

		for (int i = 0; i <= t.length() - pLength; i++) {
			if (Integer.parseInt(t.charAt(i) + "") <= Integer.parseInt(p.charAt(0) + "")) {
				if (t.substring(i, i + (pLength)).compareTo(p) <= 0) answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";

		SmallString dollCatch = new SmallString();
		int solution = dollCatch.solutionStream(t, p);
		System.out.println("solution = " + solution);
	}
}
