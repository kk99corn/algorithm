package progrmmers.level0;

/*
programmers
level: 0
title: qr code
url: https://school.programmers.co.kr/learn/courses/30/lessons/181903
*/
public class QrCode {

	public String solution(int q, int r, String code) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < code.length(); i++) {
			if (i % q == r) answer.append(code.charAt(i));
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		QrCode solution = new QrCode();

		int q = 3;
		int r = 1;
		String code = "qjnwezgrpirldywt";
		String solution1 = solution.solution(q, r, code);
		System.out.println("result = " + (solution1));
	}
}
