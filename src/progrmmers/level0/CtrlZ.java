package progrmmers.level0;

import java.util.Stack;

/*
programmers
level: 0
title: 컨트롤 제트
url: https://school.programmers.co.kr/learn/courses/30/lessons/120853
*/
public class CtrlZ {

	public int solution(String s) {
		int answer = 0;

		String[] data = s.split(" ");
		Stack<String> stack = new Stack<>();
		for (String d : data) {
			if (d.equals("Z")) {
				if (!stack.empty()) {
					answer -= Integer.parseInt(stack.pop());
				}
			} else {
				answer += Integer.parseInt(d);
				stack.push(d);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "1 2 Z 3";
		CtrlZ solution = new CtrlZ();
		int solution1 = solution.solution(s);
		System.out.println("result = " + solution1);
	}
}
