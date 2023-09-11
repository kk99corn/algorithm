package progrmmers.level0;

/*
programmers
level: 0
title: 수 조작하기 1
url: https://school.programmers.co.kr/learn/courses/30/lessons/181926
*/
public class ControlNumber {

	public int solution(int n, String control) {
		int answer = n;
		for (int i = 0; i < control.length(); i++) {
			char c = control.charAt(i);
			switch (c) {
				case 'w' -> answer += 1;
				case 's' -> answer -= 1;
				case 'd' -> answer += 10;
				case 'a' -> answer -= 10;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		ControlNumber solution = new ControlNumber();

		int n = 0;
		String control = "wsdawsdassw";
		int result = solution.solution(n, control);
		System.out.println("result = " + (result));
	}
}
