package progrmmers.level0;

/*
programmers
level: 0
title: 이진수 더하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120885
*/
public class BinarySum {

	public String solution(String bin1, String bin2) {
		return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
	}

	public static void main(String[] args) {
		String bin1 = "1001";
		String bin2 = "1111";
		BinarySum solution = new BinarySum();
		String solution1 = solution.solution(bin1, bin2);
		System.out.println("result = " + solution1);
	}
}
