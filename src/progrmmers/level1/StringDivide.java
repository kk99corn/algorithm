package progrmmers.level1;

/*
programmers
level: 1
title: 문자열 나누기
url: https://school.programmers.co.kr/learn/courses/30/lessons/140108
*/
public class StringDivide {

	public int solution(String s) {
		int answer = 0;

		while (s.length() > 0) {
			int a = 0;
			int b = 0;
			for (int i = 0; i < s.length(); i++) {
				char X = s.charAt(0);
				if (X == s.charAt(i)) {
					++a;
				} else {
					++b;
				}
				if (a == b) {
					answer++;
					s = s.substring(i + 1);
					break;
				}
			}

			if (s.length() <= 1) {
				if (s.length() == 1) answer++;
				break;
			}

			if (a != b) {
				answer++;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String ingredient = "aaabbaccccabba";
		StringDivide solution = new StringDivide();
		int solution1 = solution.solution(ingredient);
		System.out.println("result = " + (solution1));
	}
}
