package progrmmers.level0;

/*
programmers
level: 0
title: 코드 처리하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181932
*/
public class Code {

	public String solution(String code) {
		String answer = "";
		int mode = 0;

		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '1') {
				mode = (mode == 0) ? 1 : 0;
			} else {
				if (mode == 0) {
					answer += ((i % 2 == 0) ? code.charAt(i) : "");
				} else {
					answer += ((i % 2 != 0) ? code.charAt(i) : "");
				}
			}
		}

		return (answer.equals("")) ? "EMPTY" : answer;
	}

	public static void main(String[] args) {
		String code = "abc1abc1abc";
		Code solution = new Code();
		String solution1 = solution.solution(code);
		System.out.println("result = " + (solution1));
	}
}
