package progrmmers.level0;

/*
programmers
level: 0
title: 다항식 더하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120863
*/
public class PolynomialAddition {

	public String solution(String polynomial) {
		String[] values = polynomial.split(" \\+ ");

		int f = 0;
		int b = 0;

		for (String value : values) {
			if (value.contains("x")) {
				value = value.replaceAll("x", "");
				if (value.length() == 0) value = "1";
				f += Integer.parseInt(value);
			} else {
				b += Integer.parseInt(value);
			}
		}
		String answer = "";
		if (f > 0) answer = ((f == 1) ? "" : f) + "x";
		if (f > 0 && b > 0) answer += " + " + b;
		if (f == 0 && b > 0) answer = Integer.toString(b);
		return answer;
	}

	public static void main(String[] args) {
		String ploynomial = "3x + 7 + x";
		PolynomialAddition solution = new PolynomialAddition();
		String solution1 = solution.solution(ploynomial);
		System.out.println("result = " + solution1);
	}
}
